package com.service;

import java.util.List;

import com.domain.DienThoaiDTO;
import com.domain.MuaDTO;

public interface MuaService {
	List<MuaDTO> getAllMua();

	void addMua(MuaDTO MuaDTO);

	void editMua(MuaDTO MuaDTO);

	void deleteMua(int id);

	MuaDTO getMuaByID(int id);
}
