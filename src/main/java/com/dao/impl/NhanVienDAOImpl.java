package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhanVienDAO;
import com.model.NhanVien;

@Repository
@Transactional
public class NhanVienDAOImpl extends AbstractRootDao implements NhanVienDAO {

	public void addNV(NhanVien nhanVien) {
		super.save(nhanVien);
	}

	public void editNV(NhanVien nhanVien) {
		super.merge(nhanVien);
	}

	public void deleteNV(NhanVien nhanVien) {
		super.delete(nhanVien);
	}

	public List<NhanVien> getAllNV() {
		return super.findAll(NhanVien.class);
	}

	public NhanVien getNVByID(int id) {
		return super.findById(NhanVien.class, id);
	}

}
