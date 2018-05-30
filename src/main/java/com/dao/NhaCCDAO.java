package com.dao;

import java.util.List;

import com.model.NhaCC;

public interface NhaCCDAO {
	void addNhaCC(NhaCC nhaCC);

	void editNhaCC(NhaCC nhaCC);

	void deleteNhaCC(NhaCC nhaCC);

	List<NhaCC> getAllNhaCC();

	NhaCC getNhaCCByID(int id);
}
