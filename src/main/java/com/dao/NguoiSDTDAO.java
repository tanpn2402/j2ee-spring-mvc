package com.dao;

import java.util.List;

import com.model.NguoiSDT;

public interface NguoiSDTDAO {
	void addNguoiSDT(NguoiSDT nguoiSDT);

	void editNguoiSDT(NguoiSDT nguoiSDT);

	void deleteNguoiSDT(NguoiSDT nguoiSDT);

	List<NguoiSDT> getAllNguoiSDT();

	NguoiSDT getNguoiSDTByID(int id);
}
