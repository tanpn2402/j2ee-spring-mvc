package com.dao;

import java.util.List;

import com.model.Khach;

public interface KhachDAO {
	void addKH(Khach khach);

	void editKH(Khach khach);

	void deleteKH(Khach khach);

	List<Khach> getAllKH();

	Khach getKHByID(int id);
}
