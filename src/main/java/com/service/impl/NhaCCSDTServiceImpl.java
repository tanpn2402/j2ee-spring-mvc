package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhaCCSDTDAO;
import com.domain.NhaCCSDTDTO;
import com.model.NhaCCSDT;
import com.service.NhaCCSDTService;

@Service
@Transactional
public class NhaCCSDTServiceImpl implements NhaCCSDTService {

	@Autowired
	private NhaCCSDTDAO nhaCCSDTDAO;

	public void addNhaCCSDT(NhaCCSDTDTO nhaCCSDTDTO) {
		NhaCCSDT nhaCCSDT = new NhaCCSDT();
		nhaCCSDT.setNhaCCID(nhaCCSDTDTO.getNhaCCID());
		nhaCCSDT.setSdt(nhaCCSDTDTO.getSdt());
		nhaCCSDTDAO.addNhaCCSDT(nhaCCSDT);
	}

	public void editNhaCCSDT(NhaCCSDTDTO nhaCCSDTDTO) {
		NhaCCSDT nhaCCSDT = nhaCCSDTDAO.getNhaCCSDTByID(nhaCCSDTDTO.getNhaCCID());
		nhaCCSDT.setNhaCCID(nhaCCSDTDTO.getNhaCCID());
		nhaCCSDT.setSdt(nhaCCSDTDTO.getSdt());
		nhaCCSDTDAO.editNhaCCSDT(nhaCCSDT);
	}

	public void deleteNhaCCSDT(int id) {
		NhaCCSDT nhaCCSDT = nhaCCSDTDAO.getNhaCCSDTByID(id);
		if (nhaCCSDT != null) {
			nhaCCSDTDAO.deleteNhaCCSDT(nhaCCSDT);
		}
	}

	public List<NhaCCSDTDTO> getAllNhaCCSDT() {
		List<NhaCCSDT> list = nhaCCSDTDAO.getAllNhaCCSDT();
		List<NhaCCSDTDTO> nhaCCSDTDTOs = new ArrayList<NhaCCSDTDTO>();
		for (NhaCCSDT ns : list) {
			NhaCCSDTDTO nsd = new NhaCCSDTDTO();
			nsd.setNhaCCID(ns.getNhaCCID());
			nsd.setSdt(ns.getSdt());

			nhaCCSDTDTOs.add(nsd);
		}
		return nhaCCSDTDTOs;
	}

	public NhaCCSDTDTO getNhaCCSDTByID(int id) {
		NhaCCSDT ns = nhaCCSDTDAO.getNhaCCSDTByID(id);
		if (ns == null) {
			return null;
		}
		NhaCCSDTDTO nsd = new NhaCCSDTDTO();
		nsd.setNhaCCID(ns.getNhaCCID());
		nsd.setSdt(ns.getSdt());
		return nsd;
	}

}
