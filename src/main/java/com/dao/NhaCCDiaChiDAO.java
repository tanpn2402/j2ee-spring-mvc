package com.dao;

import java.util.List;

import com.model.NhaCCDiaChi;

public interface NhaCCDiaChiDAO {
	void addNhaCCDiaChi(NhaCCDiaChi nhaCCDiaChi);

	void editNhaCCDiaChi(NhaCCDiaChi nhaCCDiaChi);

	void deleteNhaCCDiaChi(NhaCCDiaChi nhaCCDiaChi);

	List<NhaCCDiaChi> getAllNhaCCDiaChi();

	NhaCCDiaChi getNhaCCDiaChiByID(int id);
}
