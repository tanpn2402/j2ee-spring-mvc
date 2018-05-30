package com.service;

import java.util.List;

import com.domain.CungCapDTO;

public interface CungCapService {
	List<CungCapDTO> getAllCungCap();

	void addCC(CungCapDTO cungCapDTO);

	void editCC(CungCapDTO cungCapDTO);

	void deleteCC(int id);

	CungCapDTO getCCByID(int id);
}
