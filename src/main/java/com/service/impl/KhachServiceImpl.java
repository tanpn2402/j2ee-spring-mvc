package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.KhachDAO;
import com.domain.KhachDTO;
import com.model.Khach;
import com.service.KhachService;

@Service
@Transactional
public class KhachServiceImpl implements KhachService {
	@Autowired
	private KhachDAO khachDAO;

	public void addKH(KhachDTO khachDTO) {
		Khach k = new Khach();
		k.setKhNguoiID(khachDTO.getKhNguoiID());
		k.setNgheNghiep(khachDTO.getNgheNghiep());

		khachDAO.addKH(k);
		khachDTO.setId(k.getId());
	}

	public void editKH(KhachDTO khachDTO) {
		Khach k = khachDAO.getKHByID(khachDTO.getId());
		k.setKhNguoiID(khachDTO.getKhNguoiID());
		k.setNgheNghiep(khachDTO.getNgheNghiep());

		khachDAO.editKH(k);
	}

	public void deleteKH(int id) {
		Khach k = khachDAO.getKHByID(id);
		if (k != null) {
			khachDAO.deleteKH(k);
		}
	}

	public List<KhachDTO> getAllKH() {
		List<Khach> list = khachDAO.getAllKH();
		List<KhachDTO> khachDTOs = new ArrayList<KhachDTO>();
		for (Khach k : list) {
			KhachDTO kd = new KhachDTO();
			kd.setId(k.getId());
			kd.setKhNguoiID(k.getKhNguoiID());
			kd.setNgheNghiep(k.getNgheNghiep());

			khachDTOs.add(kd);
		}
		return khachDTOs;
	}

	public KhachDTO getKHByID(int id) {
		Khach k = khachDAO.getKHByID(id);
		KhachDTO kd = new KhachDTO();
		kd.setId(k.getId());
		kd.setKhNguoiID(k.getKhNguoiID());
		kd.setNgheNghiep(k.getNgheNghiep());
		
		return kd;
	}

}
