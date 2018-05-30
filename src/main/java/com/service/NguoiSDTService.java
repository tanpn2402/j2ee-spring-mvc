package com.service;

import java.util.List;

import com.domain.NguoiSDTDTO;

public interface NguoiSDTService {
	void addNguoiSDT(NguoiSDTDTO nguoiSDTDTO);

	void editNguoiSDT(NguoiSDTDTO nguoiSDTDTO);

	void deleteNguoiSDT(int id);

	NguoiSDTDTO getNguoiSDTByID(int id);

	List<NguoiSDTDTO> getAllNguoiSDT();
}
