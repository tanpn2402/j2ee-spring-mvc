package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.HeDieuHanhDAO;
import com.domain.HeDieuHanhDTO;
import com.model.HeDieuHanh;
import com.service.HeDieuHanhService;

@Service
@Transactional
public class HeDieuHanhServiceImpl implements HeDieuHanhService {
	
	@Autowired
	private HeDieuHanhDAO heDieuHanhDAO;

	public void addHDH(HeDieuHanhDTO heDieuHanhDTO) {
		HeDieuHanh hdh = new HeDieuHanh();
		hdh.setTen(heDieuHanhDTO.getTen());
		heDieuHanhDAO.addHDH(hdh);
		
		heDieuHanhDTO.setId(hdh.getId());
	}

	public void editHDH(HeDieuHanhDTO heDieuHanhDTO) {
		HeDieuHanh hdh = heDieuHanhDAO.getHDHByID(heDieuHanhDTO.getId());
		hdh.setTen(heDieuHanhDTO.getTen());
		
		heDieuHanhDAO.editHDH(hdh);
	}

	public void deleteHDH(int id) {
		HeDieuHanh hdh = heDieuHanhDAO.getHDHByID(id);
		if(hdh != null){
			heDieuHanhDAO.deleteHDH(hdh);
		}
	}

	public HeDieuHanhDTO getHDHByID(int id) {
		HeDieuHanh hdh = heDieuHanhDAO.getHDHByID(id);
		if(hdh == null){
			return null;
		}
		HeDieuHanhDTO hd = new HeDieuHanhDTO();
		hd.setId(hdh.getId());
		hd.setTen(hdh.getTen());
		
		return hd;
	}

	public List<HeDieuHanhDTO> getAllHDH() {
		List<HeDieuHanh> list = heDieuHanhDAO.getAllHDH();
		List<HeDieuHanhDTO> heDieuHanhDTOs = new ArrayList<HeDieuHanhDTO>();
		for (HeDieuHanh hdh : list) {
			HeDieuHanhDTO hd = new HeDieuHanhDTO();
			hd.setId(hdh.getId());
			hd.setTen(hdh.getTen());
			
			heDieuHanhDTOs.add(hd);
		}
		return heDieuHanhDTOs;
	}

}
