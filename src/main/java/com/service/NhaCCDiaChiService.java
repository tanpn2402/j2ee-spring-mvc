package com.service;

import java.util.List;

import com.domain.NhaCCDiaChiDTO;


public interface NhaCCDiaChiService {
	void addNhaCCDiaChi(NhaCCDiaChiDTO nhaCCDiaChiDTO);

	void editNhaCCDiaChi(NhaCCDiaChiDTO nhaCCDiaChiDTO);

	void deleteNhaCCDiaChi(int id);

	List<NhaCCDiaChiDTO> getAllNhaCCDiaChi();

	NhaCCDiaChiDTO getNhaCCDiaChiByID(int id);
}
