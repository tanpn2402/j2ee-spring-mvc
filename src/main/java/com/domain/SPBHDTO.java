package com.domain;

import java.io.Serializable;

public class SPBHDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String ten;
	private String ngayNhan;
	private String ngayTra;
	private String noiDung;
	private int phi;
	private int khachID;
	private String khachTen;

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

	public String getNgayNhan() {
		return ngayNhan;
	}

	public void setNgayNhan(String ngayNhan) {
		this.ngayNhan = ngayNhan;
	}

	public String getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public int getPhi() {
		return phi;
	}

	public void setPhi(int phi) {
		this.phi = phi;
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

}
