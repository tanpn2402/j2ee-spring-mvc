package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.CungCapDTO;
import com.service.CungCapService;
import com.service.DienThoaiService;
import com.service.HoaDonService;
import com.service.NhaCCService;

@Controller
@RequestMapping(value = "/hoa-don")
public class CungCapController {
	@Autowired
	private CungCapService cungCapService;
	@Autowired
	private DienThoaiService dtService;
	@Autowired
	private NhaCCService nccService;
	@Autowired
	private HoaDonService hdService;

	@RequestMapping(value = "/ds-nhap", method = RequestMethod.GET)
	public String listNhap(Model model) {
		model.addAttribute("listCC", cungCapService.getAllCungCap());
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listNCC", nccService.getAllNhaCC());
		model.addAttribute("listHD", hdService.getAllHD());
		return "listNhap";
	}

	@RequestMapping(value = "/them-nhap", method = RequestMethod.GET)
	public String addNhap(Model model) {
		model.addAttribute("addNhapForm", new CungCapDTO());
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listNCC", nccService.getAllNhaCC());
		model.addAttribute("listHD", hdService.getAllHD());
		return "addNhap";
	}

	@RequestMapping(value = "/them-nhap", method = RequestMethod.POST)
	public String addNhap(Model model, @ModelAttribute("addNhapForm") CungCapDTO cungCapDTO, BindingResult result) {
		if(result.hasErrors()){
			return "addNhap";
		}
		cungCapService.addCC(cungCapDTO);
		return "redirect: /QuanLybanDienThoai/hoa-don/xem-nhap/" + cungCapDTO.getId();
	}
	
	@RequestMapping (value = "/xem-nhap/{id}", method = RequestMethod.GET)
	public String viewNhap(Model model, @PathVariable(value = "id") int id){
		CungCapDTO cungCapDTO = cungCapService.getCCByID(id);
		model.addAttribute("cc", cungCapDTO);
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listNCC", nccService.getAllNhaCC());
		model.addAttribute("listHD", hdService.getAllHD());
		return "viewNhap";
	}
	
	@RequestMapping (value = "/xoa-nhap/{id}", method = RequestMethod.GET)
	public String deleteNhap(@PathVariable(value = "id") int id){
		cungCapService.deleteCC(id);
		return "redirect: /QuanLybanDienThoai/hoa-don/ds-nhap";
	}
	
	@RequestMapping (value = "/sua-nhap/{id}", method = RequestMethod.GET)
	public String editNhap(Model model, @PathVariable(value = "id") int id){
		CungCapDTO cungCapDTO = cungCapService.getCCByID(id);
		model.addAttribute("editNhapForm", cungCapDTO);
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listNCC", nccService.getAllNhaCC());
		model.addAttribute("listHD", hdService.getAllHD());
		return "editNhap";
	}
	
	@RequestMapping (value = "/sua-nhap", method = RequestMethod.POST)
	public String editNhap(Model model, @ModelAttribute("editNhapForm") CungCapDTO cungCapDTO, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("editNhapForm", cungCapDTO);
			return "editNhap";
		}
		cungCapService.editCC(cungCapDTO);
		return "redirect: /QuanLybanDienThoai/hoa-don/xem-nhap/" + cungCapDTO.getId();
	}
}
