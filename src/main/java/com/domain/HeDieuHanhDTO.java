package com.domain;

import java.io.Serializable;

public class HeDieuHanhDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String ten;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

}
