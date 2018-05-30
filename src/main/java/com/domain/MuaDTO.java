package com.domain;

import java.io.Serializable;

public class MuaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int dtID;
	private String dtTen;
	private int khachID;
	private String khachTen;
	private int soLuong;
	private int hdID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDtID() {
		return dtID;
	}

	public void setDtID(int dtID) {
		this.dtID = dtID;
	}

	public String getDtTen() {
		return dtTen;
	}

	public void setDtTen(String dtTen) {
		this.dtTen = dtTen;
	}

	public int getKhachID() {
		return khachID;
	}

	public void setKhachID(int khachID) {
		this.khachID = khachID;
	}

	public String getKhachTen() {
		return khachTen;
	}

	public void setKhachTen(String khachTen) {
		this.khachTen = khachTen;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getHdID() {
		return hdID;
	}

	public void setHdID(int hdID) {
		this.hdID = hdID;
	}

}
