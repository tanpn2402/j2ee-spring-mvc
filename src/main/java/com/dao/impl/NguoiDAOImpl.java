package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NguoiDAO;
import com.model.Nguoi;

@Repository
@Transactional
public class NguoiDAOImpl extends AbstractRootDao implements NguoiDAO {

	public void addNguoi(Nguoi nguoi) {
		super.save(nguoi);
	}

	public void editNguoi(Nguoi nguoi) {
		super.merge(nguoi);
	}

	public void deleteNguoi(Nguoi nguoi) {
		super.delete(nguoi);
	}

	public List<Nguoi> getAllNguoi() {
		return super.findAll(Nguoi.class);
	}

	public Nguoi getNguoiByID(int id) {
		return super.findById(Nguoi.class, id);
	}

}
