package com.dao;

import java.util.List;

import com.model.SanPhamBaoHanh;

public interface SPBHDAO {
	void addSPBH(SanPhamBaoHanh sanPhamBaoHanh);

	void editSPBH(SanPhamBaoHanh sanPhamBaoHanh);

	void deleteSPBH(SanPhamBaoHanh sanPhamBaoHanh);

	List<SanPhamBaoHanh> getAllSPBH();

	SanPhamBaoHanh getSPBHByID(int id);
}
