package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.DienThoaiDTO;
import com.service.CungCapService;
import com.service.DienThoaiService;
import com.service.HeDieuHanhService;
import com.service.NhaCCService;

@Controller
@RequestMapping (value = "/dt")
public class DienThoaiController {
	@Autowired
	private DienThoaiService dienThoaiService;
	@Autowired
	private HeDieuHanhService heDieuHanhService;
	@Autowired
	private NhaCCService nhaCCService;
	@Autowired
	private CungCapService cungCapService;
	
	@RequestMapping (value = "/ds", method = RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("listDT", dienThoaiService.getAllDT());
		model.addAttribute("listCC", cungCapService.getAllCungCap());
		return "listDT";
	}
	
	@RequestMapping (value = "/them", method = RequestMethod.GET)
	public String add(Model model){
		model.addAttribute("listHDH", heDieuHanhService.getAllHDH());
		model.addAttribute("listNCC", nhaCCService.getAllNhaCC());
		model.addAttribute("addDTForm", new DienThoaiDTO());
		return "addDT";
	}
	
	@RequestMapping (value = "/them", method = RequestMethod.POST)
	public String add(Model model, @ModelAttribute ("addDTForm") DienThoaiDTO dienThoaiDTO, BindingResult result){
		if(result.hasErrors()){
			return "addDT";
		}
		dienThoaiService.addDT(dienThoaiDTO);
		return "redirect: /QuanLybanDienThoai/dt/xem/" + dienThoaiDTO.getId();
	}
	
	@RequestMapping (value = "/xem/{id}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable (value = "id") int id){
		DienThoaiDTO dienThoaiDTO = dienThoaiService.getDTByID(id);
		model.addAttribute("dt", dienThoaiDTO);
		return "viewDT";
	}
	
	@RequestMapping (value = "/xoa/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable (value = "id") int id){
		dienThoaiService.deleteDT(id);
		return "redirect: /QuanLybanDienThoai/dt/ds";
	}
	
	@RequestMapping (value = "/sua/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable (value = "id") int id){
		model.addAttribute("listHDH", heDieuHanhService.getAllHDH());
		model.addAttribute("listNCC", nhaCCService.getAllNhaCC());
		model.addAttribute("editDTForm", dienThoaiService.getDTByID(id));
		return "editDT";
	}
	
	@RequestMapping (value = "/sua", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute ("editDTForm") DienThoaiDTO dienThoaiDTO, BindingResult result){
		if(result.hasErrors()){
			model.addAttribute("editDTForm", dienThoaiDTO);
			return "editDT";
		}
		dienThoaiService.editDT(dienThoaiDTO);
		return "redirect: /QuanLybanDienThoai/dt/xem/" + dienThoaiDTO.getId();
	}
}
