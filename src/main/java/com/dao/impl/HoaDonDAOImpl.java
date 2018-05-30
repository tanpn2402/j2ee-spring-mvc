package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.HoaDonDAO;
import com.model.HoaDon;

@Repository
@Transactional
public class HoaDonDAOImpl extends AbstractRootDao implements HoaDonDAO {

	public void addHD(HoaDon hoaDon) {
		super.save(hoaDon);
	}

	public void editHD(HoaDon hoaDon) {
		super.merge(hoaDon);
	}

	public void deleteHD(HoaDon hoaDon) {
		super.delete(hoaDon);
	}

	public List<HoaDon> getAllHD() {
		return super.findAll(HoaDon.class);
	}

	public HoaDon getHDByID(int id) {
		return super.findById(HoaDon.class, id);
	}

}
