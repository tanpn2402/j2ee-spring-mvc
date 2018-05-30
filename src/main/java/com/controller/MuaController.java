package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.KhachDAO;
import com.domain.MuaDTO;
import com.service.MuaService;
import com.service.NguoiService;
import com.service.CungCapService;
import com.service.DienThoaiService;
import com.service.HoaDonService;
import com.service.KhachService;

@Controller
@RequestMapping(value = "/hoa-don")
public class MuaController {
	@Autowired
	private MuaService muaService;
	@Autowired
	private DienThoaiService dtService;
	@Autowired
	private KhachService khachService;
	@Autowired
	private HoaDonService hdService;
	@Autowired
	private NguoiService nguoiService;
	@Autowired
	private CungCapService cungCapService;

	@RequestMapping(value = "/ds-mua", method = RequestMethod.GET)
	public String listmua(Model model) {
		model.addAttribute("listMua", muaService.getAllMua());
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listHD", hdService.getAllHD());
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		return "listMua";
	}

	@RequestMapping(value = "/them-mua", method = RequestMethod.GET)
	public String addmua(Model model) {
		model.addAttribute("addMuaForm", new MuaDTO());
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listHD", hdService.getAllHD());
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		model.addAttribute("listCC", cungCapService.getAllCungCap());
		return "addMua";
	}

	@RequestMapping(value = "/them-mua", method = RequestMethod.POST)
	public String addmua(Model model, @ModelAttribute("addMuaForm") MuaDTO muaDTO, BindingResult result) {
		if (result.hasErrors()) {
			return "addMua";
		}
		muaService.addMua(muaDTO);
		dtService.editSoLuong(muaDTO.getDtID(),
				dtService.getDTByID(muaDTO.getDtID()).getSoLuong() - muaDTO.getSoLuong());
		return "redirect: /QuanLybanDienThoai/hoa-don/xem-mua/" + muaDTO.getId();
	}

	@RequestMapping(value = "/xem-mua/{id}", method = RequestMethod.GET)
	public String viewmua(Model model, @PathVariable(value = "id") int id) {
		MuaDTO muaDTO = muaService.getMuaByID(id);
		model.addAttribute("mua", muaDTO);
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listHD", hdService.getAllHD());
		return "viewMua";
	}

	@RequestMapping(value = "/xoa-mua/{id}", method = RequestMethod.GET)
	public String deletemua(@PathVariable(value = "id") int id) {
		muaService.deleteMua(id);
		return "redirect: /QuanLybanDienThoai/hoa-don/ds-mua";
	}

	@RequestMapping(value = "/sua-mua/{id}", method = RequestMethod.GET)
	public String editmua(Model model, @PathVariable(value = "id") int id) {
		MuaDTO MuaDTO = muaService.getMuaByID(id);
		model.addAttribute("editMuaForm", MuaDTO);
		model.addAttribute("listDT", dtService.getAllDT());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listHD", hdService.getAllHD());
		return "editMua";
	}

	@RequestMapping(value = "/sua-mua", method = RequestMethod.POST)
	public String editmua(Model model, @ModelAttribute("editmuaForm") MuaDTO muaDTO, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("editMuaForm", muaDTO);
			return "editMua";
		}
		muaService.editMua(muaDTO);
		return "redirect: /QuanLybanDienThoai/hoa-don/xem-mua/" + muaDTO.getId();
	}
}
