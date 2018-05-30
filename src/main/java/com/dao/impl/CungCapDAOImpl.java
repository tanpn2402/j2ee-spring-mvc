package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CungCapDAO;
import com.model.CungCap;

@Repository
@Transactional
public class CungCapDAOImpl extends AbstractRootDao implements CungCapDAO {

	public List<CungCap> getAllCungCap() {
		return super.findAll(CungCap.class);
	}

	public void addCC(CungCap cungCap) {
		super.save(cungCap);
	}

	public void editCC(CungCap cungCap) {
		super.merge(cungCap);
	}

	public void deleteCC(CungCap cungCap) {
		super.delete(cungCap);
	}

	public List<CungCap> getAllCC() {
		return super.findAll(CungCap.class);
	}

	public CungCap getCCByID(int id) {
		return super.findById(CungCap.class, id);
	}

}
