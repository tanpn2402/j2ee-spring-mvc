package com.service;

import java.util.List;

import com.domain.KhachDTO;
import com.domain.NguoiDTO;
import com.domain.NguoiSDTDTO;
import com.domain.NhanVienDTO;

public interface NguoiService {
	void addNV(NguoiDTO nguoiDTO, NguoiSDTDTO nguoiSDTDTO, NhanVienDTO nhanVienDTO);
	
	void addKH(NguoiDTO nguoiDTO, NguoiSDTDTO nguoiSDTDTO, KhachDTO khachDTO);

	void editNguoi(NguoiDTO nguoiDTO);

	void deleteNguoi(int id);

	NguoiDTO getNguoiByID(int id);

	List<NguoiDTO> getAllNguoi();
}
