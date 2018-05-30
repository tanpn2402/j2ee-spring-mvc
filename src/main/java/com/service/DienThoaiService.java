package com.service;

import java.util.List;

import com.domain.DienThoaiDTO;

public interface DienThoaiService {
	void addDT(DienThoaiDTO dienThoaiDTO);

	void editDT(DienThoaiDTO dienThoaiDTO);

	void deleteDT(int id);

	List<DienThoaiDTO> getAllDT();

	DienThoaiDTO getDTByID(int id);
	
	void editSoLuong(int id, int soLuong);
}
