package com.domain;

import java.io.Serializable;
import java.util.List;

import com.model.NhaCC;

public class DienThoaiDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String ten;
	private int soLuong;
	private String giaNhap;
	private String giaBan;
	private int bh;
	private int hdhID;
	private String hdhTen;
	private int nhaCCID;
	private String nhaCCTen;
	private List<NhaCC> listNCC;
	private List<Integer> listIDNCC;

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

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(String giaNhap) {
		this.giaNhap = giaNhap;
	}

	public String getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(String giaBan) {
		this.giaBan = giaBan;
	}

	public int getBh() {
		return bh;
	}

	public void setBh(int bh) {
		this.bh = bh;
	}

	public int getHdhID() {
		return hdhID;
	}

	public void setHdhID(int hdhID) {
		this.hdhID = hdhID;
	}

	public String getHdhTen() {
		return hdhTen;
	}

	public void setHdhTen(String hdhTen) {
		this.hdhTen = hdhTen;
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

	public List<NhaCC> getListNCC() {
		return listNCC;
	}

	public void setListNCC(List<NhaCC> listNCC) {
		this.listNCC = listNCC;
	}

	public List<Integer> getListIDNCC() {
		return listIDNCC;
	}

	public void setListIDNCC(List<Integer> listIDNCC) {
		this.listIDNCC = listIDNCC;
	}

}
