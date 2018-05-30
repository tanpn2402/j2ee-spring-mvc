package com.dao;

import java.util.List;

import com.model.DienThoai;

public interface DienThoaiDAO {
	void addDT(DienThoai dienThoai);

	void editDT(DienThoai dienThoai);

	void deleteDT(DienThoai dienThoai);

	List<DienThoai> getAllDT();

	DienThoai getDTByID(int id);
}
