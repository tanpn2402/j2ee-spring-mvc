package com.service;

import java.util.List;

import com.domain.SPBHDTO;

public interface SPBHService {
	void addSPBH(SPBHDTO sPBHDTO);

	void editSPBH(SPBHDTO sPBHDTO);

	void deleteSPBH(int id);

	List<SPBHDTO> getAllSPBH();

	SPBHDTO getSPBHByID(int id);
}
