package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.HeDieuHanhDTO;
import com.service.HeDieuHanhService;

@Controller
@RequestMapping (value = "/hdh")
public class HeDieuHanhController {
	@Autowired
	private HeDieuHanhService heDieuHanhService;
	
	@RequestMapping (value = "/ds", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("listHDH", heDieuHanhService.getAllHDH());
		return "listHDH";
	}
	
	@RequestMapping (value = "/them", method = RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("addHDHForm", new HeDieuHanhDTO());
		return "addHDH";
	}
	
	@RequestMapping (value = "/them", method = RequestMethod.POST)
	public String add(Model model, @ModelAttribute ("addHDHForm") HeDieuHanhDTO heDieuHanhDTO, BindingResult result){
		if(result.hasErrors()){
			return "addHDH";
		}
		heDieuHanhService.addHDH(heDieuHanhDTO);
		return "redirect: /QuanLybanDienThoai/hdh/xem/" + heDieuHanhDTO.getId();
	}
	
	@RequestMapping (value = "/xem/{id}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("hdh", heDieuHanhService.getHDHByID(id));
		return "viewHDH";
	}
	
	@RequestMapping (value = "/xoa/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable (value = "id") int id){
		heDieuHanhService.deleteHDH(id);
		return "redirect: /QuanLybanDienThoai/hdh/ds";
	}
	
	@RequestMapping (value = "/sua/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("editHDHForm", heDieuHanhService.getHDHByID(id));
		return "editHDH";
	}
	
	@RequestMapping (value = "/sua", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute ("editHDHForm") HeDieuHanhDTO heDieuHanhDTO, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("editHDHForm", heDieuHanhDTO);
			return "editHDH";
		}
		heDieuHanhService.editHDH(heDieuHanhDTO);
		return "redirect: /QuanLybanDienThoai/hdh/xem/" + heDieuHanhDTO.getId();
	}
}
