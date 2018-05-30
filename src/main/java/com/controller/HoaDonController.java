package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.HoaDonDTO;
import com.service.HoaDonService;
import com.service.NguoiService;
import com.service.NhanVienService;

@Controller
@RequestMapping (value = "/hoa-don")
public class HoaDonController {
	@Autowired
	private HoaDonService hoaDonService;
	@Autowired
	private NguoiService nguoiService;
	@Autowired
	private NhanVienService nvService;
	
	@RequestMapping (value = "/ds-hd", method = RequestMethod.GET)
	public String listHD(Model model){
		model.addAttribute("listHD", hoaDonService.getAllHD());
		return "listHD";
	}
	
	@RequestMapping (value = "/them-hd", method = RequestMethod.GET)
	public String addHD(Model model){
		model.addAttribute("addHDForm", new HoaDonDTO());
		model.addAttribute("listNV", nvService.getAllNV());
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		return "addHD";
	}
	
	@RequestMapping (value = "/them-hd", method = RequestMethod.POST)
	public String addHD(Model model, @ModelAttribute("addHDForm") HoaDonDTO hoaDonDTO, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("addHDForm", hoaDonDTO);
			return "addHD";
		}
		hoaDonService.addHD(hoaDonDTO);
		return "redirect: /QuanLybanDienThoai/hoa-don/xem/" + hoaDonDTO.getId();
	}
	
	@RequestMapping (value = "/xem/{id}", method = RequestMethod.GET)
	public String viewHD(Model model, @PathVariable (value = "id") int id){
		HoaDonDTO hoaDonDTO = hoaDonService.getHDByID(id);
		model.addAttribute("hoaDon", hoaDonDTO);
		return "viewHD";
	}
}
