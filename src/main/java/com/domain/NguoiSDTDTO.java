package com.domain;

import java.io.Serializable;

public class NguoiSDTDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int nguoiID;
	private String sdt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNguoiID() {
		return nguoiID;
	}

	public void setNguoiID(int nguoiID) {
		this.nguoiID = nguoiID;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
}
