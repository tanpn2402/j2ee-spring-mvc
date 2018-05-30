package com.dao;

import java.util.List;

import com.model.HeDieuHanh;

public interface HeDieuHanhDAO {
	void addHDH(HeDieuHanh hdh);

	void editHDH(HeDieuHanh hdh);

	void deleteHDH(HeDieuHanh hdh);

	List<HeDieuHanh> getAllHDH();

	HeDieuHanh getHDHByID(int id);
}
