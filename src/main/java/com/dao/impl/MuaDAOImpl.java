package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MuaDAO;
import com.model.Mua;

@Repository
@Transactional
public class MuaDAOImpl extends AbstractRootDao implements MuaDAO {

	public void addMua(Mua mua) {
		super.save(mua);
	}

	public void editMua(Mua mua) {
		super.merge(mua);
	}

	public void deleteMua(Mua mua) {
		super.delete(mua);
	}

	public List<Mua> getAllMua() {
		return super.findAll(Mua.class);
	}

	public Mua getMuaByID(int id) {
		return super.findById(Mua.class, id);
	}

}
