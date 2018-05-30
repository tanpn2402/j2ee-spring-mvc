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

import com.domain.NhaCCDiaChiDTO;
import com.domain.NhaCCSDTDTO;
import com.domain.NhaCungCapDTO;
import com.service.NhaCCDiaChiService;
import com.service.NhaCCSDTService;
import com.service.NhaCCService;

@Controller
@RequestMapping(value = "/ncc")
public class NhaCCController {

	@Autowired
	private NhaCCService nhaCCService;
	@Autowired
	private NhaCCSDTService nhaCCSDTService;
	@Autowired
	private NhaCCDiaChiService nhaCCDiaChiService;

	@RequestMapping(value = "/ds", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("listTen", nhaCCService.getAllNhaCC());
		model.addAttribute("listSDT", nhaCCSDTService.getAllNhaCCSDT());
		model.addAttribute("listDiaChi", nhaCCDiaChiService.getAllNhaCCDiaChi());
		return "listNCC";
	}

	@RequestMapping(value = "/xem/{id}", method = RequestMethod.GET)
	public String view(Model model, @PathVariable(value = "id") int id) {
		model.addAttribute("ncc", nhaCCService.getNhaCCByID(id));
		model.addAttribute("listSDT", nhaCCSDTService.getAllNhaCCSDT());
		model.addAttribute("listDC", nhaCCDiaChiService.getAllNhaCCDiaChi());
		return "viewNCC";
	}

	@RequestMapping(value = "/them", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("addNCCForm", new NhaCungCapDTO());
		return "addNCC";
	}

	@RequestMapping(value = "/them", method = RequestMethod.POST)
	public String add(Model model, @ModelAttribute() NhaCungCapDTO nhaCungCapDTO, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("addNCCForm", nhaCungCapDTO);
			return "addNCC";
		}
		nhaCCService.addNhaCC(nhaCungCapDTO.getNhaCCDTO(), nhaCungCapDTO.getNhaCCDiaChiDTO(),
				nhaCungCapDTO.getNhaCCSDTDTO());
		nhaCCDiaChiService.addNhaCCDiaChi(nhaCungCapDTO.getNhaCCDiaChiDTO());
		nhaCCSDTService.addNhaCCSDT(nhaCungCapDTO.getNhaCCSDTDTO());
		return "redirect: /QuanLybanDienThoai/ncc/xem/" + nhaCungCapDTO.getNhaCCDTO().getId();
	}
	
	@RequestMapping(value = "/xoa/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable(value = "id") int id){
		// xoa nha cung cap
		nhaCCService.deleteNhaCC(id);
		// xoa dia chi cua nha cung cap tuong ung
		List<NhaCCDiaChiDTO> listDC = nhaCCDiaChiService.getAllNhaCCDiaChi();
		for (NhaCCDiaChiDTO nhaCCDiaChiDTO : listDC) {
			if(nhaCCDiaChiDTO.getNhaCCID() == id){
				nhaCCDiaChiService.deleteNhaCCDiaChi(nhaCCDiaChiDTO.getId());
			}
		}
		// xoa sdt cua nha cung cap tuong ung
		List<NhaCCSDTDTO> listSDT = nhaCCSDTService.getAllNhaCCSDT();
		for (NhaCCSDTDTO nhaCCSDTDTO : listSDT) {
			if(nhaCCSDTDTO.getNhaCCID() == id){
				nhaCCDiaChiService.deleteNhaCCDiaChi(nhaCCSDTDTO.getId());
			}
		}
		return "redirect: /QuanLybanDienThoai/ncc/ds";
	}
}
