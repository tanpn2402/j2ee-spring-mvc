package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CungCapDAO;
import com.dao.DienThoaiDAO;
import com.dao.HoaDonDAO;
import com.dao.NhaCCDAO;
import com.domain.CungCapDTO;
import com.model.CungCap;
import com.service.CungCapService;

@Service
@Transactional
public class CungCapServiceImpl implements CungCapService {
	@Autowired
	private CungCapDAO cungCapDAO;
	@Autowired
	private HoaDonDAO hoaDonDAO;
	@Autowired
	private DienThoaiDAO dienThoaiDAO;
	@Autowired
	private NhaCCDAO nhaCCDAO;

	public List<CungCapDTO> getAllCungCap() {
		List<CungCap> list = cungCapDAO.getAllCC();
		List<CungCapDTO> cungCapDTOs = new ArrayList<CungCapDTO>();
		for (CungCap cc : list) {
			CungCapDTO cungCapDTO = new CungCapDTO();
			cungCapDTO.setId(cc.getId());
			cungCapDTO.setDtID(cc.getDienThoai().getId());
			cungCapDTO.setDtTen(cc.getDienThoai().getTen());
			cungCapDTO.setNhaCCID(cc.getNhaCC().getId());
			cungCapDTO.setNhaCCTen(cc.getNhaCC().getTen());
			cungCapDTO.setSoLuong(cc.getSoLuong());
			cungCapDTO.setHdID(cc.getHoaDon().getId());

			cungCapDTOs.add(cungCapDTO);
		}
		return cungCapDTOs;
	}

	public void addCC(CungCapDTO cungCapDTO) {
		CungCap cc= new CungCap();
		cc.setHoaDon(hoaDonDAO.getHDByID(cungCapDTO.getHdID()));
		cc.setSoLuong(cungCapDTO.getSoLuong());
		cc.setDienThoai(dienThoaiDAO.getDTByID(cungCapDTO.getDtID()));
		cc.setNhaCC(nhaCCDAO.getNhaCCByID(cungCapDTO.getNhaCCID()));
		
		cungCapDAO.addCC(cc);
		cungCapDTO.setId(cc.getId());
	}

	public void editCC(CungCapDTO cungCapDTO) {
		CungCap cc = cungCapDAO.getCCByID(cungCapDTO.getId());
		cc.setHoaDon(hoaDonDAO.getHDByID(cungCapDTO.getHdID()));
		cc.setSoLuong(cungCapDTO.getSoLuong());
		cc.setDienThoai(dienThoaiDAO.getDTByID(cungCapDTO.getDtID()));
		cc.setNhaCC(nhaCCDAO.getNhaCCByID(cungCapDTO.getNhaCCID()));
		
		cungCapDAO.editCC(cc);
	}

	public void deleteCC(int id) {
		CungCap cc = cungCapDAO.getCCByID(id);
		if (cc != null) {
			cungCapDAO.deleteCC(cc);
		}
	}

	public CungCapDTO getCCByID(int id) {
		CungCap cc = cungCapDAO.getCCByID(id);

		CungCapDTO cungCapDTO = new CungCapDTO();
		cungCapDTO.setId(cc.getId());
		cungCapDTO.setDtID(cc.getDienThoai().getId());
		cungCapDTO.setDtTen(cc.getDienThoai().getTen());
		cungCapDTO.setNhaCCID(cc.getNhaCC().getId());
		cungCapDTO.setNhaCCTen(cc.getNhaCC().getTen());
		cungCapDTO.setSoLuong(cc.getSoLuong());
		cungCapDTO.setHdID(cc.getHoaDon().getId());

		return cungCapDTO;
	}

}
