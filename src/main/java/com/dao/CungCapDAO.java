package com.dao;

import java.util.List;

import com.model.CungCap;

public interface CungCapDAO {
	void addCC(CungCap cungCap);

	void editCC(CungCap cungCap);

	void deleteCC(CungCap cungCap);

	List<CungCap> getAllCC();

	CungCap getCCByID(int id);
}
