package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhanVienDAO;
import com.domain.NhanVienDTO;
import com.model.NhanVien;
import com.service.NhanVienService;

@Service
@Transactional
public class NhanVienServiceImpl implements NhanVienService {
	@Autowired
	private NhanVienDAO nhanVienDAO;

	public void addNV(NhanVienDTO nhanVienDTO) {
		NhanVien nv = new NhanVien();
		nv.setNvNguoiID(nhanVienDTO.getNvNguoiID());
		nv.setLuong(nhanVienDTO.getLuong());
		
		nhanVienDAO.addNV(nv);
		nhanVienDTO.setId(nv.getId());
	}

	public void editNV(NhanVienDTO nhanVienDTO) {
		NhanVien nv = nhanVienDAO.getNVByID(nhanVienDTO.getId());
		nv.setNvNguoiID(nhanVienDTO.getNvNguoiID());
		nv.setLuong(nhanVienDTO.getLuong());
		nhanVienDAO.editNV(nv);
	}

	public void deleteNV(int id) {
		NhanVien nv = nhanVienDAO.getNVByID(id);
		if(nv != null){
			nhanVienDAO.deleteNV(nv);
		}
	}

	public List<NhanVienDTO> getAllNV() {
		List<NhanVien> list = nhanVienDAO.getAllNV();
		List<NhanVienDTO> nvDtos = new ArrayList<NhanVienDTO>();
		for (NhanVien nhanVien : list) {
			NhanVienDTO nvd = new NhanVienDTO();
			nvd.setId(nhanVien.getId());
			nvd.setNvNguoiID(nhanVien.getNvNguoiID());
			nvd.setLuong(nhanVien.getLuong());
			
			nvDtos.add(nvd);
		}
		return nvDtos;
	}

	public NhanVienDTO getNVByID(int id) {
		NhanVien nhanVien = nhanVienDAO.getNVByID(id);
		NhanVienDTO nvd = new NhanVienDTO();
		nvd.setId(nhanVien.getId());
		nvd.setNvNguoiID(nhanVien.getNvNguoiID());
		nvd.setLuong(nhanVien.getLuong());
		
		return nvd;
	}

}
