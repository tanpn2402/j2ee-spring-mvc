package com.domain;

import java.io.Serializable;

public class CungCapDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private int dtID;
	private String dtTen;
	private int nhaCCID;
	private String nhaCCTen;
	private int soLuong;
	private int hdID;

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

	public int getNhaCCID() {
		return nhaCCID;
	}

	public void setNhaCCID(int nhaCCID) {
		this.nhaCCID = nhaCCID;
	}

	public String getNhaCCTen() {
		return nhaCCTen;
	}

	public void setNhaCCTen(String nhaCCTen) {
		this.nhaCCTen = nhaCCTen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
