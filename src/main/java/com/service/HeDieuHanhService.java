package com.service;

import java.util.List;

import com.domain.HeDieuHanhDTO;

public interface HeDieuHanhService {
	void addHDH(HeDieuHanhDTO heDieuHanhDTO);

	void editHDH(HeDieuHanhDTO heDieuHanhDTO);

	void deleteHDH(int id);

	HeDieuHanhDTO getHDHByID(int id);

	List<HeDieuHanhDTO> getAllHDH();
}
