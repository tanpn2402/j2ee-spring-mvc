package com.domain;

import java.io.Serializable;

public class NhaCCSDTDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int nhaCCID;
	private String sdt;

	public int getNhaCCID() {
		return nhaCCID;
	}

	public void setNhaCCID(int nhaCCID) {
		this.nhaCCID = nhaCCID;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
