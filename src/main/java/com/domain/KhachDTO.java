package com.domain;

import java.io.Serializable;

public class KhachDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private int khNguoiID;
	private String ngheNghiep;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKhNguoiID() {
		return khNguoiID;
	}

	public void setKhNguoiID(int khNguoiID) {
		this.khNguoiID = khNguoiID;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

}
