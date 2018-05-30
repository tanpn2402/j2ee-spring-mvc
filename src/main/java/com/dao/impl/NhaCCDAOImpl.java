package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhaCCDAO;
import com.model.NhaCC;

@Repository
@Transactional
public class NhaCCDAOImpl extends AbstractRootDao implements NhaCCDAO {

	public void addNhaCC(NhaCC nhaCC) {
		super.save(nhaCC);
	}

	public void editNhaCC(NhaCC nhaCC) {
		super.merge(nhaCC);
	}

	public void deleteNhaCC(NhaCC nhaCC) {
		super.delete(nhaCC);
	}

	public List<NhaCC> getAllNhaCC() {
		return super.findAll(NhaCC.class);
	}

	public NhaCC getNhaCCByID(int id) {
		return super.findById(NhaCC.class, id);
	}

}
