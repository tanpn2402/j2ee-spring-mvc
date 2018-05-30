package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhaCCDiaChiDAO;
import com.domain.NhaCCDiaChiDTO;
import com.model.NhaCCDiaChi;
import com.service.NhaCCDiaChiService;

@Service
@Transactional
public class NhaCCDiaChiServiceImpl implements NhaCCDiaChiService {

	@Autowired
	private NhaCCDiaChiDAO nhaCCDiaChiDAO;

	public void addNhaCCDiaChi(NhaCCDiaChiDTO nhaCCDiaChiDTO) {
		NhaCCDiaChi nhaCCDiaChi = new NhaCCDiaChi();
		nhaCCDiaChi.setNhaCCID(nhaCCDiaChiDTO.getNhaCCID());
		nhaCCDiaChi.setDiaChi(nhaCCDiaChiDTO.getDiaChi());
		nhaCCDiaChiDAO.addNhaCCDiaChi(nhaCCDiaChi);
		nhaCCDiaChiDTO.setId(nhaCCDiaChi.getId());
	}

	public void editNhaCCDiaChi(NhaCCDiaChiDTO NhaCCDiaChiDTO) {
		NhaCCDiaChi nhaCCDiaChi = nhaCCDiaChiDAO.getNhaCCDiaChiByID(NhaCCDiaChiDTO.getNhaCCID());
		nhaCCDiaChi.setNhaCCID(NhaCCDiaChiDTO.getNhaCCID());
		nhaCCDiaChi.setDiaChi(NhaCCDiaChiDTO.getDiaChi());
		nhaCCDiaChiDAO.editNhaCCDiaChi(nhaCCDiaChi);
	}

	public void deleteNhaCCDiaChi(int id) {
		NhaCCDiaChi nhaCCDiaChi = nhaCCDiaChiDAO.getNhaCCDiaChiByID(id);
		if (nhaCCDiaChi != null) {
			nhaCCDiaChiDAO.deleteNhaCCDiaChi(nhaCCDiaChi);
		}
	}

	public List<NhaCCDiaChiDTO> getAllNhaCCDiaChi() {
		List<NhaCCDiaChi> list = nhaCCDiaChiDAO.getAllNhaCCDiaChi();
		List<NhaCCDiaChiDTO> nhaCCDiaChiDTOs = new ArrayList<NhaCCDiaChiDTO>();
		for (NhaCCDiaChi ns : list) {
			NhaCCDiaChiDTO nsd = new NhaCCDiaChiDTO();
			nsd.setId(ns.getId());
			nsd.setNhaCCID(ns.getNhaCCID());
			nsd.setDiaChi(ns.getDiaChi());

			nhaCCDiaChiDTOs.add(nsd);
		}
		return nhaCCDiaChiDTOs;
	}

	public NhaCCDiaChiDTO getNhaCCDiaChiByID(int id) {
		NhaCCDiaChi ns = nhaCCDiaChiDAO.getNhaCCDiaChiByID(id);
		if (ns == null) {
			return null;
		}
		NhaCCDiaChiDTO nsd = new NhaCCDiaChiDTO();
		nsd.setId(ns.getId());
		nsd.setNhaCCID(ns.getNhaCCID());
		nsd.setDiaChi(ns.getDiaChi());
		return nsd;
	}

}
