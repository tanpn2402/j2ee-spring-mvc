package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NguoiSDTDAO;
import com.model.NguoiSDT;

@Repository
@Transactional
public class NguoiSDTDAOImpl extends AbstractRootDao implements NguoiSDTDAO {

	public void addNguoiSDT(NguoiSDT nguoiSDT) {
		super.save(nguoiSDT);
	}

	public void editNguoiSDT(NguoiSDT nguoiSDT) {
		super.merge(nguoiSDT);
	}

	public void deleteNguoiSDT(NguoiSDT nguoiSDT) {
		super.delete(nguoiSDT);
	}

	public List<NguoiSDT> getAllNguoiSDT() {
		return super.findAll(NguoiSDT.class);
	}

	public NguoiSDT getNguoiSDTByID(int id) {
		return super.findById(NguoiSDT.class, id);
	}

}
