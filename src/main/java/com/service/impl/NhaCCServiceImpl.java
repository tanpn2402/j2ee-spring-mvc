package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhaCCDAO;
import com.domain.NhaCCDTO;
import com.domain.NhaCCDiaChiDTO;
import com.domain.NhaCCSDTDTO;
import com.model.NhaCC;
import com.service.NhaCCService;

@Service
@Transactional
public class NhaCCServiceImpl implements NhaCCService {

	@Autowired
	private NhaCCDAO nhaCCDAO;

	public void addNhaCC(NhaCCDTO nhaCCDTO, NhaCCDiaChiDTO nhaCCDiaChiDTO, NhaCCSDTDTO nhaCCSDTDTO) {
		NhaCC nhaCC = new NhaCC();
		nhaCC.setTen(nhaCCDTO.getTen());

		nhaCCDAO.addNhaCC(nhaCC);
		nhaCCDTO.setId(nhaCC.getId());
		nhaCCDiaChiDTO.setNhaCCID(nhaCC.getId());
		nhaCCSDTDTO.setNhaCCID(nhaCC.getId());
	}

	public void editNhaCC(NhaCCDTO nhaCCDTO) {
		NhaCC nhaCC = nhaCCDAO.getNhaCCByID(nhaCCDTO.getId());
		nhaCC.setTen(nhaCCDTO.getTen());
		nhaCCDAO.editNhaCC(nhaCC);
	}

	public void deleteNhaCC(int id) {
		NhaCC nhaCC = nhaCCDAO.getNhaCCByID(id);
		if (nhaCC != null) {
			nhaCCDAO.deleteNhaCC(nhaCC);
		}
	}

	public List<NhaCCDTO> getAllNhaCC() {
		List<NhaCC> list = nhaCCDAO.getAllNhaCC();
		List<NhaCCDTO> nhaCCDTOs = new ArrayList<NhaCCDTO>();
		for (NhaCC nhaCC : list) {
			NhaCCDTO nd = new NhaCCDTO();
			nd.setId(nhaCC.getId());
			nd.setTen(nhaCC.getTen());

			nhaCCDTOs.add(nd);
		}
		return nhaCCDTOs;
	}

	public NhaCCDTO getNhaCCByID(int id) {
		NhaCC nhaCC = nhaCCDAO.getNhaCCByID(id);
		if (nhaCC == null) {
			return null;
		}
		NhaCCDTO nd = new NhaCCDTO();
		nd.setId(nhaCC.getId());
		nd.setTen(nhaCC.getTen());
		return nd;
	}

}
