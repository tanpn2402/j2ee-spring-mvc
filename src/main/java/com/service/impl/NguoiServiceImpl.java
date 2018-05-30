package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NguoiDAO;
import com.domain.KhachDTO;
import com.domain.NguoiDTO;
import com.domain.NguoiSDTDTO;
import com.domain.NhanVienDTO;
import com.model.Nguoi;
import com.service.NguoiService;

@Service
@Transactional
public class NguoiServiceImpl implements NguoiService {

	@Autowired
	private NguoiDAO nguoiDAO;

	public void addNV(NguoiDTO nguoiDTO, NguoiSDTDTO nguoiSDTDTO, NhanVienDTO nhanVienDTO) {
		Nguoi n = new Nguoi();
		n.setTen(nguoiDTO.getTen());
		n.setEmail(nguoiDTO.getEmail());
		n.setGioiTinh(nguoiDTO.getGioiTinh());
		n.setNamSinh(nguoiDTO.getNamSinh());
		n.setNguoiType(nguoiDTO.getNguoiType());

		nguoiDAO.addNguoi(n);
		nguoiDTO.setId(n.getId());
		nguoiSDTDTO.setNguoiID(n.getId());
		nhanVienDTO.setNvNguoiID(n.getId());
	}

	public void addKH(NguoiDTO nguoiDTO, NguoiSDTDTO nguoiSDTDTO, KhachDTO khachDTO) {
		Nguoi n = new Nguoi();
		n.setTen(nguoiDTO.getTen());
		n.setEmail(nguoiDTO.getEmail());
		n.setGioiTinh(nguoiDTO.getGioiTinh());
		n.setNamSinh(nguoiDTO.getNamSinh());
		n.setNguoiType(nguoiDTO.getNguoiType());

		nguoiDAO.addNguoi(n);
		nguoiDTO.setId(n.getId());
		nguoiSDTDTO.setNguoiID(n.getId());
		khachDTO.setKhNguoiID(n.getId());
	}

	public void editNguoi(NguoiDTO nguoiDTO) {
		Nguoi n = nguoiDAO.getNguoiByID(nguoiDTO.getId());
		n.setTen(nguoiDTO.getTen());
		n.setEmail(nguoiDTO.getEmail());
		n.setGioiTinh(nguoiDTO.getGioiTinh());
		n.setNamSinh(nguoiDTO.getNamSinh());
		n.setNguoiType(nguoiDTO.getNguoiType());

		nguoiDAO.editNguoi(n);
	}

	public void deleteNguoi(int id) {
		Nguoi n = nguoiDAO.getNguoiByID(id);
		if (n != null) {
			nguoiDAO.deleteNguoi(n);
		}
	}

	public NguoiDTO getNguoiByID(int id) {
		Nguoi n = nguoiDAO.getNguoiByID(id);
		if (n == null) {
			return null;
		}
		NguoiDTO nguoiDTO = new NguoiDTO();
		nguoiDTO.setId(n.getId());
		nguoiDTO.setEmail(n.getEmail());
		nguoiDTO.setGioiTinh(n.getGioiTinh());
		nguoiDTO.setNamSinh(n.getNamSinh());
		nguoiDTO.setNguoiType(n.getNguoiType());
		nguoiDTO.setTen(n.getTen());

		return nguoiDTO;
	}

	public List<NguoiDTO> getAllNguoi() {
		List<Nguoi> list = nguoiDAO.getAllNguoi();
		List<NguoiDTO> nguoiDTOs = new ArrayList<NguoiDTO>();
		for (Nguoi n : list) {
			NguoiDTO nguoiDTO = new NguoiDTO();
			nguoiDTO.setId(n.getId());
			nguoiDTO.setEmail(n.getEmail());
			nguoiDTO.setGioiTinh(n.getGioiTinh());
			nguoiDTO.setNamSinh(n.getNamSinh());
			nguoiDTO.setNguoiType(n.getNguoiType());
			nguoiDTO.setTen(n.getTen());

			nguoiDTOs.add(nguoiDTO);
		}
		return nguoiDTOs;
	}

}
