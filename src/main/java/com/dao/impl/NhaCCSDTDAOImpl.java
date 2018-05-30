package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhaCCSDTDAO;
import com.model.NhaCCSDT;

@Repository
@Transactional
public class NhaCCSDTDAOImpl extends AbstractRootDao implements NhaCCSDTDAO {

	public void addNhaCCSDT(NhaCCSDT nhaCCSDT) {
		super.save(nhaCCSDT);
	}

	public void editNhaCCSDT(NhaCCSDT nhaCCSDT) {
		super.merge(nhaCCSDT);
	}

	public void deleteNhaCCSDT(NhaCCSDT nhaCCSDT) {
		super.delete(nhaCCSDT);
	}

	public List<NhaCCSDT> getAllNhaCCSDT() {
		return super.findAll(NhaCCSDT.class);
	}

	public NhaCCSDT getNhaCCSDTByID(int id) {
		return super.findById(NhaCCSDT.class, id);
	}

}
