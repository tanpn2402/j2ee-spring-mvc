package com.dao;

import java.util.List;

import com.model.NhaCCSDT;

public interface NhaCCSDTDAO {
	void addNhaCCSDT(NhaCCSDT nhaCCSDT);

	void editNhaCCSDT(NhaCCSDT nhaCCSDT);

	void deleteNhaCCSDT(NhaCCSDT nhaCCSDT);

	List<NhaCCSDT> getAllNhaCCSDT();

	NhaCCSDT getNhaCCSDTByID(int id);
}
