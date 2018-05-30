package com.dao;

import java.util.List;

import com.model.HoaDon;

public interface HoaDonDAO {
	void addHD(HoaDon hoaDon);

	void editHD(HoaDon hoaDon);

	void deleteHD(HoaDon hoaDon);

	List<HoaDon> getAllHD();

	HoaDon getHDByID(int id);
}
