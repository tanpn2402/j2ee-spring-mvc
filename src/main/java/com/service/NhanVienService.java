package com.service;

import java.util.List;

import com.domain.NhanVienDTO;

public interface NhanVienService {
	void addNV(NhanVienDTO nhanVienDTO);

	void editNV(NhanVienDTO nhanVienDTO);

	void deleteNV(int id);

	List<NhanVienDTO> getAllNV();

	NhanVienDTO getNVByID(int id);
}
