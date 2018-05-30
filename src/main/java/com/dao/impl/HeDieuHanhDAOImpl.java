package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.HeDieuHanhDAO;
import com.model.HeDieuHanh;

@Repository
@Transactional
public class HeDieuHanhDAOImpl extends AbstractRootDao implements HeDieuHanhDAO {

	public void addHDH(HeDieuHanh hdh) {
		super.save(hdh);
	}

	public void editHDH(HeDieuHanh hdh) {
		super.merge(hdh);
	}

	public void deleteHDH(HeDieuHanh hdh) {
		super.delete(hdh);
	}

	public List<HeDieuHanh> getAllHDH() {
		return super.findAll(HeDieuHanh.class);
	}

	public HeDieuHanh getHDHByID(int id) {
		return super.findById(HeDieuHanh.class, id);
	}

}
