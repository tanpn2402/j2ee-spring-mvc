package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.KhachDTO;
import com.domain.NguoiAll;
import com.domain.NguoiDTO;
import com.domain.NguoiSDTDTO;
import com.domain.NhanVienDTO;
import com.service.KhachService;
import com.service.NguoiSDTService;
import com.service.NguoiService;
import com.service.NhanVienService;

@Controller
@RequestMapping (value = "/user")
public class NguoiController {
	@Autowired
	private NguoiService nguoiService;
	@Autowired
	private NguoiSDTService nguoiSDTService;
	@Autowired
	private NhanVienService nvService;
	@Autowired
	private KhachService khachService;
	
	// Nhan vien
	@RequestMapping (value = "/ds-nv", method = RequestMethod.GET)
	public String listNV(Model model){
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		model.addAttribute("listNV", nvService.getAllNV());
		model.addAttribute("listNguoiSDT", nguoiSDTService.getAllNguoiSDT());
		return "listNV";
	}
	
	@RequestMapping (value = "/them-nv", method = RequestMethod.GET)
	public String addNV(Model model){
		model.addAttribute("addNguoiForm", new NguoiAll());
		return "addNV";
	}
	
	@RequestMapping (value = "/them-nv", method = RequestMethod.POST)
	public String addNV(Model model, @ModelAttribute ("addNguoiForm") NguoiAll nguoiAll, BindingResult result){
		if(result.hasErrors()){
			return "addNV";
		}
		nguoiService.addNV(nguoiAll.getNguoiDTO(), nguoiAll.getNguoiSDTDTO(), nguoiAll.getNhanVienDTO());
		nguoiSDTService.addNguoiSDT(nguoiAll.getNguoiSDTDTO());
		nvService.addNV(nguoiAll.getNhanVienDTO());
		return "redirect: /QuanLybanDienThoai/user/xem-nv/" + nguoiAll.getNguoiDTO().getId();
	}
	
	@RequestMapping (value = "/xem-nv/{id}", method = RequestMethod.GET)
	public String viewNV(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("nguoi", nguoiService.getNguoiByID(id));
		model.addAttribute("listNV", nvService.getAllNV());
		model.addAttribute("listNguoiSDT", nguoiSDTService.getAllNguoiSDT());
		return "viewNV";
	}
	
	@RequestMapping (value = "/xoa-nv/{id}", method = RequestMethod.GET)
	public String deleteNV(@PathVariable (value = "id") int id){
		nguoiService.deleteNguoi(id);
		// xoa thong tin trong table Nguoi
		List<NguoiSDTDTO> listSDT = nguoiSDTService.getAllNguoiSDT();
		for (NguoiSDTDTO nguoiSDTDTO : listSDT) {
			if(nguoiSDTDTO.getNguoiID() == id) {
				nguoiSDTService.deleteNguoiSDT(nguoiSDTDTO.getId());
			}
		}
		// xoa thong tin NV
		List<NhanVienDTO> listNV = nvService.getAllNV();
		for (NhanVienDTO nvDTO : listNV) {
			if(nvDTO.getNvNguoiID() == id){
				nvService.deleteNV(nvDTO.getId());
			}
		}
		return "redirect: /QuanLybanDienThoai/user/ds-nv";
	}
	
	@RequestMapping (value = "/sua-nv/{id}", method = RequestMethod.GET)
	public String editNV(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("editNguoiForm", nguoiService.getNguoiByID(id));
		model.addAttribute("listNV", nvService.getAllNV());
		return "editNV";
	}
	
	@RequestMapping (value = "/sua-nv", method = RequestMethod.POST)
	public String editNV(Model model, @ModelAttribute ("editNguoiForm") NguoiDTO nguoiDTO, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("editNguoiForm", nguoiDTO);
			return "editNV";
		}
		nguoiService.editNguoi(nguoiDTO);
		return "redirect: /QuanLybanDienThoai/user/xem-nv/" + nguoiDTO.getId();
	}
	
	// Khach hang
	@RequestMapping (value = "/ds-kh", method = RequestMethod.GET)
	public String listKH(Model model){
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listNguoiSDT", nguoiSDTService.getAllNguoiSDT());
		return "listKH";
	}
	
	@RequestMapping (value = "/them-kh", method = RequestMethod.GET)
	public String addKH(Model model){
		model.addAttribute("addNguoiForm", new NguoiAll());
		return "addKH";
	}
	
	@RequestMapping (value = "/them-kh", method = RequestMethod.POST)
	public String addKH(Model model, @ModelAttribute ("addNguoiForm") NguoiAll nguoiAll, BindingResult result){
		if(result.hasErrors()){
			return "addKH";
		}
		nguoiService.addKH(nguoiAll.getNguoiDTO(), nguoiAll.getNguoiSDTDTO(), nguoiAll.getKhachDTO());
		nguoiSDTService.addNguoiSDT(nguoiAll.getNguoiSDTDTO());
		khachService.addKH(nguoiAll.getKhachDTO());
		return "redirect: /QuanLybanDienThoai/user/xem-kh/" + nguoiAll.getNguoiDTO().getId();
	}
	
	@RequestMapping (value = "/xem-kh/{id}", method = RequestMethod.GET)
	public String viewKH(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("nguoi", nguoiService.getNguoiByID(id));
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listNguoiSDT", nguoiSDTService.getAllNguoiSDT());
		return "viewKH";
	}
	
	@RequestMapping (value = "/xoa-kh/{id}", method = RequestMethod.GET)
	public String deleteKH(@PathVariable (value = "id") int id){
		nguoiService.deleteNguoi(id);
		// xoa thong tin trong table Nguoi
		List<NguoiSDTDTO> listSDT = nguoiSDTService.getAllNguoiSDT();
		for (NguoiSDTDTO nguoiSDTDTO : listSDT) {
			if(nguoiSDTDTO.getNguoiID() == id) {
				nguoiSDTService.deleteNguoiSDT(nguoiSDTDTO.getId());
			}
		}
		// xoa thong tin NV
		List<KhachDTO> listKH = khachService.getAllKH();
		for (KhachDTO khachDTO : listKH) {
			if(khachDTO.getKhNguoiID() == id){
				khachService.deleteKH(khachDTO.getId());
			}
		}
		return "redirect: /QuanLybanDienThoai/user/ds-kh";
	}
	
	@RequestMapping (value = "/sua-kh/{id}", method = RequestMethod.GET)
	public String editKH(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("editNguoiForm", nguoiService.getNguoiByID(id));
		model.addAttribute("listKH", nvService.getAllNV());
		return "editKH";
	}
	
	@RequestMapping (value = "/sua-kh", method = RequestMethod.POST)
	public String editKH(Model model, @ModelAttribute ("editNguoiForm") NguoiDTO nguoiDTO, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("editNguoiForm", nguoiDTO);
			return "editKH";
		}
		nguoiService.editNguoi(nguoiDTO);
		return "redirect: /QuanLybanDienThoai/user/xem-kh/" + nguoiDTO.getId();
	}
}
