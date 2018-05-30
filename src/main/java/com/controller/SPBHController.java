package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.SPBHDTO;
import com.service.DienThoaiService;
import com.service.KhachService;
import com.service.NguoiService;
import com.service.SPBHService;

@Controller
@RequestMapping (value = "/spbh")
public class SPBHController {
	@Autowired
	private SPBHService spbhService;
	@Autowired
	private KhachService khachService;
	@Autowired
	private NguoiService nguoiService;
	@Autowired
	private DienThoaiService dienThoaiService;
	
	@RequestMapping (value = "/ds", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("listSPBH", spbhService.getAllSPBH());
		return "listSPBH";
	}
	
	@RequestMapping (value = "/them", method = RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("addSPBHForm", new SPBHDTO());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listDT", dienThoaiService.getAllDT());
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		return "addSPBH";
	}
	
	@RequestMapping (value = "/them", method = RequestMethod.POST)
	public String add(Model model, @ModelAttribute("addSPBHForm") SPBHDTO spbhdto, BindingResult result){
		if(result.hasErrors()){
			return "addSPBH";
		}
		spbhService.addSPBH(spbhdto);
		return "redirect: /QuanLybanDienThoai/spbh/xem/" + spbhdto.getId();
	}
	
	@RequestMapping (value = "/xem/{id}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable(value = "id") int id){
		SPBHDTO spbhdto = spbhService.getSPBHByID(id);
		model.addAttribute("spbh", spbhdto);
		return "viewSPBH";
	}
	
	@RequestMapping (value = "/xoa/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable(value = "id") int id){
		spbhService.deleteSPBH(id);
		return "redirect: /QuanLybanDienThoai/spbh/ds";
	}
	
	@RequestMapping (value = "/sua/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id){
		model.addAttribute("editSPBHForm", spbhService.getSPBHByID(id));
		model.addAttribute("listDT", dienThoaiService.getAllDT());
		model.addAttribute("listKH", khachService.getAllKH());
		model.addAttribute("listDT", dienThoaiService.getAllDT());
		model.addAttribute("listNguoi", nguoiService.getAllNguoi());
		return "editSPBH";
	}
	
	@RequestMapping (value = "/sua", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute("editSPBHForm") SPBHDTO spbhdto, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("editSPBHForm", spbhdto);
			return "editSPBH";
		}
		spbhService.editSPBH(spbhdto);
		return "redirect: /QuanLybanDienThoai/spbh/xem/" + spbhdto.getId();
	}
}
