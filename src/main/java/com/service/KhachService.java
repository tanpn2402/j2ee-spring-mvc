package com.service;

import java.util.List;

import com.domain.KhachDTO;

public interface KhachService {
	void addKH(KhachDTO khachDTO);

	void editKH(KhachDTO khachDTO);

	void deleteKH(int id);

	List<KhachDTO> getAllKH();

	KhachDTO getKHByID(int id);
}
