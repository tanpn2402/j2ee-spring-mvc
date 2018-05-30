package com.dao;

import java.util.List;

import com.model.Mua;

public interface MuaDAO {
	void addMua(Mua mua);

	void editMua(Mua mua);

	void deleteMua(Mua mua);

	List<Mua> getAllMua();

	Mua getMuaByID(int id);
}
