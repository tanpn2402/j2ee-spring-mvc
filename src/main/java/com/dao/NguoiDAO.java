package com.dao;

import java.util.List;

import com.model.Nguoi;

public interface NguoiDAO {
	void addNguoi(Nguoi nguoi);

	void editNguoi(Nguoi nguoi);

	void deleteNguoi(Nguoi nguoi);

	List<Nguoi> getAllNguoi();

	Nguoi getNguoiByID(int id);
}
