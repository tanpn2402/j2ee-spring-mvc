package com.service;

import java.util.List;

import com.domain.HoaDonDTO;

public interface HoaDonService {
	void addHD(HoaDonDTO hoaDonDTO);

	void editHD(HoaDonDTO hoaDonDTO);

	void deleteHD(int id);

	List<HoaDonDTO> getAllHD();

	HoaDonDTO getHDByID(int id);
}
