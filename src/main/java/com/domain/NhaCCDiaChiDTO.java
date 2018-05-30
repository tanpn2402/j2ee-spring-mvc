package com.domain;

import java.io.Serializable;

public class NhaCCDiaChiDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int nhaCCID;
	private String diaChi;

	public int getNhaCCID() {
		return nhaCCID;
	}

	public void setNhaCCID(int nhaCCID) {
		this.nhaCCID = nhaCCID;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
