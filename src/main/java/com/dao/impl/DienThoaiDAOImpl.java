package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DienThoaiDAO;
import com.model.DienThoai;

@Repository
@Transactional
public class DienThoaiDAOImpl extends AbstractRootDao implements DienThoaiDAO {

	public void addDT(DienThoai dienThoai) {
		super.save(dienThoai);
	}

	public void editDT(DienThoai dienThoai) {
		super.merge(dienThoai);
	}

	public void deleteDT(DienThoai dienThoai) {
		super.delete(dienThoai);
	}

	public List<DienThoai> getAllDT() {
		return super.findAll(DienThoai.class);
	}

	public DienThoai getDTByID(int id) {
		return super.findById(DienThoai.class, id);
	}

}
