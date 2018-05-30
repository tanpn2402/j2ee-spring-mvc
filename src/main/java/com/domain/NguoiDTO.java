package com.domain;

import java.io.Serializable;

public class NguoiDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String ten;
	private String gioiTinh;
	private String email;
	private int namSinh;
	private String nguoiType;

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

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getNguoiType() {
		return nguoiType;
	}

	public void setNguoiType(String nguoiType) {
		this.nguoiType = nguoiType;
	}
}
