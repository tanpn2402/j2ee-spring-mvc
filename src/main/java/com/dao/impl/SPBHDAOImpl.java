package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.SPBHDAO;
import com.model.SanPhamBaoHanh;

@Repository
@Transactional
public class SPBHDAOImpl extends AbstractRootDao implements SPBHDAO {

	public void addSPBH(SanPhamBaoHanh sanPhamBaoHanh) {
		super.save(sanPhamBaoHanh);
	}

	public void editSPBH(SanPhamBaoHanh sanPhamBaoHanh) {
		super.merge(sanPhamBaoHanh);
	}

	public void deleteSPBH(SanPhamBaoHanh sanPhamBaoHanh) {
		super.delete(sanPhamBaoHanh);
	}

	public List<SanPhamBaoHanh> getAllSPBH() {
		return super.findAll(SanPhamBaoHanh.class);
	}

	public SanPhamBaoHanh getSPBHByID(int id) {
		return super.findById(SanPhamBaoHanh.class, id);
	}

}
