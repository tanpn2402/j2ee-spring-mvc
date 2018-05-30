package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.domain.NguoiDTO;
import com.domain.NguoiSDTDTO;
import com.service.NguoiSDTService;

@Controller
@RequestMapping(value = "/user")
public class NguoiSDTController {
	@Autowired
	private NguoiSDTService nguoiSDTService;

	@RequestMapping(value = "/them-sdt", method = RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("addNguoiSDTForm", new NguoiDTO());
		return "addNguoiSDT";
	}

	@RequestMapping(value = "/them-sdt", method = RequestMethod.POST)
	public String add(Model model, @ModelAttribute("addNguoiSDTForm") NguoiSDTDTO nguoiSDTDTO , BindingResult result) {
		if (result.hasErrors()) {
			return "addNguoiSDT";
		}
		nguoiSDTService.addNguoiSDT(nguoiSDTDTO);
		return "redirect: /QuanLybanDienThoai/user/xem" + nguoiSDTDTO.getNguoiID();
	}

	@RequestMapping(value = "/sua-sdt/{id}", method = RequestMethod.GET)
	public String edit(Model model, @PathVariable(value = "id") int id) {
		model.addAttribute("editNguoiSDTForm", nguoiSDTService.getNguoiSDTByID(id));
		return "editNguoiSDT";
	}

	@RequestMapping(value = "/sua-sdt", method = RequestMethod.POST)
	public String edit(Model model, @ModelAttribute("editNguoiForm") NguoiSDTDTO nguoiSDTDTO, BindingResult result) {
		if (result.hasErrors()) {
			model.addAttribute("editNguoiSDTForm", nguoiSDTDTO);
			return "editNguoiSDT";
		}
		nguoiSDTService.editNguoiSDT(nguoiSDTDTO);
		return "redirect: /QuanLybanDienThoai/user/xem/" + nguoiSDTDTO.getNguoiID();
	}
}
