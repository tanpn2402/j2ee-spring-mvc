package com.service;

import java.util.List;

import com.domain.NhaCCDTO;
import com.domain.NhaCCDiaChiDTO;
import com.domain.NhaCCSDTDTO;

public interface NhaCCService {
	void addNhaCC(NhaCCDTO nhaCCDTO, NhaCCDiaChiDTO nhaCCDiaChiDTO, NhaCCSDTDTO nhaCCSDTDTO);

	void editNhaCC(NhaCCDTO nhaCCDTO);

	void deleteNhaCC(int id);

	List<NhaCCDTO> getAllNhaCC();

	NhaCCDTO getNhaCCByID(int id);
}
