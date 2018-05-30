package com.domain;

import java.io.Serializable;

public class NhanVienDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int nvNguoiID;
	private int luong;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNvNguoiID() {
		return nvNguoiID;
	}

	public void setNvNguoiID(int nvNguoiID) {
		this.nvNguoiID = nvNguoiID;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

}
