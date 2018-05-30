package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NguoiSDTDAO;
import com.domain.NguoiSDTDTO;
import com.model.NguoiSDT;
import com.service.NguoiSDTService;

@Service
@Transactional
public class NguoiSDTServiceImpl implements NguoiSDTService {
	@Autowired
	private NguoiSDTDAO nguoiSDTDAO;

	public void addNguoiSDT(NguoiSDTDTO nguoiSDTDTO) {
		NguoiSDT ns = new NguoiSDT();
		ns.setNguoiID(nguoiSDTDTO.getNguoiID());
		ns.setSdt(nguoiSDTDTO.getSdt());
		
		nguoiSDTDAO.addNguoiSDT(ns);
		nguoiSDTDTO.setId(ns.getId());
	}

	public void editNguoiSDT(NguoiSDTDTO nguoiSDTDTO) {
		NguoiSDT ns = nguoiSDTDAO.getNguoiSDTByID(nguoiSDTDTO.getId());
		ns.setNguoiID(nguoiSDTDTO.getNguoiID());
		ns.setSdt(nguoiSDTDTO.getSdt());
		
		nguoiSDTDAO.editNguoiSDT(ns);
	}

	public void deleteNguoiSDT(int id) {
		NguoiSDT ns = nguoiSDTDAO.getNguoiSDTByID(id);
		if(ns != null) {
			nguoiSDTDAO.deleteNguoiSDT(ns);
		}
	}

	public NguoiSDTDTO getNguoiSDTByID(int id) {
		NguoiSDT ns = nguoiSDTDAO.getNguoiSDTByID(id);
		NguoiSDTDTO nsd = new NguoiSDTDTO();
		nsd.setId(ns.getId());
		nsd.setNguoiID(ns.getNguoiID());
		nsd.setSdt(ns.getSdt());
		
		return nsd;
	}

	public List<NguoiSDTDTO> getAllNguoiSDT() {
		List<NguoiSDT> list = nguoiSDTDAO.getAllNguoiSDT();
		List<NguoiSDTDTO> nguoiSDTDTOs = new ArrayList<NguoiSDTDTO>();
		for (NguoiSDT nguoiSDT : list) {
			NguoiSDTDTO nsd = new NguoiSDTDTO();
			nsd.setId(nguoiSDT.getId());
			nsd.setNguoiID(nguoiSDT.getNguoiID());
			nsd.setSdt(nguoiSDT.getSdt());
			
			nguoiSDTDTOs.add(nsd);
		}
		return nguoiSDTDTOs;
	}

}
