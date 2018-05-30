package com.dao;

import java.util.List;

import com.model.NhanVien;

public interface NhanVienDAO {
	void addNV(NhanVien nhanVien);

	void editNV(NhanVien nhanVien);

	void deleteNV(NhanVien nhanVien);

	List<NhanVien> getAllNV();

	NhanVien getNVByID(int id);
}
