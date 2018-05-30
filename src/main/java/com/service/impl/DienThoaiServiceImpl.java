package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DienThoaiDAO;
import com.dao.HeDieuHanhDAO;
import com.domain.DienThoaiDTO;
import com.model.DienThoai;
import com.service.DienThoaiService;

@Service
@Transactional
public class DienThoaiServiceImpl implements DienThoaiService {

	@Autowired
	private DienThoaiDAO dienThoaiDAO;
	@Autowired
	private HeDieuHanhDAO heDieuHanhDAO;
//	@Autowired
//	private NhaCCDAO nhaCCDAO;

	public void addDT(DienThoaiDTO dienThoaiDTO) {
		DienThoai dt = new DienThoai();
		dt.setTen(dienThoaiDTO.getTen());
		dt.setSoLuong(dienThoaiDTO.getSoLuong());
		dt.setGiaNhap(dienThoaiDTO.getGiaNhap());
		dt.setGiaBan(dienThoaiDTO.getGiaBan());
		dt.setBh(dienThoaiDTO.getBh());
		dt.setHeDieuHanh(heDieuHanhDAO.getHDHByID(dienThoaiDTO.getHdhID()));
		

		dienThoaiDAO.addDT(dt);

		dienThoaiDTO.setId(dt.getId());
	}

	public void editDT(DienThoaiDTO dienThoaiDTO) {
		DienThoai dt = dienThoaiDAO.getDTByID(dienThoaiDTO.getId());
		dt.setTen(dienThoaiDTO.getTen());
		dt.setSoLuong(dienThoaiDTO.getSoLuong());
		dt.setGiaNhap(dienThoaiDTO.getGiaNhap());
		dt.setGiaBan(dienThoaiDTO.getGiaBan());
		dt.setBh(dienThoaiDTO.getBh());
		dt.setHeDieuHanh(heDieuHanhDAO.getHDHByID(dienThoaiDTO.getHdhID()));
		

		dienThoaiDAO.editDT(dt);
	}

	public void deleteDT(int id) {
		DienThoai dt = dienThoaiDAO.getDTByID(id);
		if (dt != null) {
			dienThoaiDAO.deleteDT(dt);
		}
	}

	public List<DienThoaiDTO> getAllDT() {
		List<DienThoai> list = dienThoaiDAO.getAllDT();
		List<DienThoaiDTO> dienThoaiDTOs = new ArrayList<DienThoaiDTO>();
		for (DienThoai dienThoai : list) {
			DienThoaiDTO dd = new DienThoaiDTO();
			dd.setId(dienThoai.getId());
			dd.setTen(dienThoai.getTen());
			dd.setSoLuong(dienThoai.getSoLuong());
			dd.setGiaNhap(dienThoai.getGiaNhap());
			dd.setGiaBan(dienThoai.getGiaBan());
			dd.setBh(dienThoai.getBh());
			dd.setHdhID(dienThoai.getHeDieuHanh().getId());
			dd.setHdhTen(dienThoai.getHeDieuHanh().getTen());
			
			dienThoaiDTOs.add(dd);
		}
		return dienThoaiDTOs;
	}

	public DienThoaiDTO getDTByID(int id) {
		DienThoai dienThoai = dienThoaiDAO.getDTByID(id);

		if (dienThoai == null) {
			return null;
		}

		DienThoaiDTO dd = new DienThoaiDTO();
		dd.setId(dienThoai.getId());
		dd.setTen(dienThoai.getTen());
		dd.setSoLuong(dienThoai.getSoLuong());
		dd.setGiaNhap(dienThoai.getGiaNhap());
		dd.setGiaBan(dienThoai.getGiaBan());
		dd.setBh(dienThoai.getBh());
		dd.setHdhID(dienThoai.getHeDieuHanh().getId());
		dd.setHdhTen(dienThoai.getHeDieuHanh().getTen());
		
		return dd;
	}

	public void editSoLuong(int id, int soLuong) {
		DienThoai dt = dienThoaiDAO.getDTByID(id);
		dt.setSoLuong(soLuong);
	}

}
