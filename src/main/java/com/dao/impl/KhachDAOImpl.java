package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.KhachDAO;
import com.model.Khach;

@Repository
@Transactional
public class KhachDAOImpl extends AbstractRootDao implements KhachDAO {

	public void addKH(Khach khach) {
		super.save(khach);
	}

	public void editKH(Khach khach) {
		super.merge(khach);
	}

	public void deleteKH(Khach khach) {
		super.delete(khach);
	}

	public List<Khach> getAllKH() {
		return super.findAll(Khach.class);
	}

	public Khach getKHByID(int id) {
		return super.findById(Khach.class, id);
	}

}
