package com.service;

import java.util.List;

import com.domain.NhaCCSDTDTO;

public interface NhaCCSDTService {
	void addNhaCCSDT(NhaCCSDTDTO nhaCCSDTDTO);

	void editNhaCCSDT(NhaCCSDTDTO nhaCCSDTDTO);

	void deleteNhaCCSDT(int id);

	List<NhaCCSDTDTO> getAllNhaCCSDT();

	NhaCCSDTDTO getNhaCCSDTByID(int id);
}
