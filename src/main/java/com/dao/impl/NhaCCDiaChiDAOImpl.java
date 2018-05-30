package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.NhaCCDiaChiDAO;
import com.model.NhaCCDiaChi;

@Repository
@Transactional
public class NhaCCDiaChiDAOImpl extends AbstractRootDao implements NhaCCDiaChiDAO {

	public void addNhaCCDiaChi(NhaCCDiaChi nhaCCDiaChi) {
		super.save(nhaCCDiaChi);
	}

	public void editNhaCCDiaChi(NhaCCDiaChi nhaCCDiaChi) {
		super.merge(nhaCCDiaChi);
	}

	public void deleteNhaCCDiaChi(NhaCCDiaChi nhaCCDiaChi) {
		super.delete(nhaCCDiaChi);
	}

	public List<NhaCCDiaChi> getAllNhaCCDiaChi() {
		return super.findAll(NhaCCDiaChi.class);
	}

	public NhaCCDiaChi getNhaCCDiaChiByID(int id) {
		return super.findById(NhaCCDiaChi.class, id);
	}

}
