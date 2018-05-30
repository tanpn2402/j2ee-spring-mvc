package com.domain;

import java.io.Serializable;

public class HoaDonDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String ngayLap;
	private int nvID;
	private String nvTen;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getNvID() {
		return nvID;
	}

	public void setNvID(int nvID) {
		this.nvID = nvID;
	}

	public String getNvTen() {
		return nvTen;
	}

	public void setNvTen(String nvTen) {
		this.nvTen = nvTen;
	}

}
