package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cung_cap")
public class CungCap {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dt_id")
	private DienThoai dienThoai;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nha_cc_id")
	private NhaCC nhaCC;
	@Column(name = "so_luong")
	private int soLuong;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hd_id")
	private HoaDon hoaDon;

	public CungCap() {
	}

	public CungCap(int id, DienThoai dienThoai, NhaCC nhaCC, int soLuong, HoaDon hoaDon) {
		super();
		this.id = id;
		this.dienThoai = dienThoai;
		this.nhaCC = nhaCC;
		this.soLuong = soLuong;
		this.hoaDon = hoaDon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DienThoai getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(DienThoai dienThoai) {
		this.dienThoai = dienThoai;
	}

	public NhaCC getNhaCC() {
		return nhaCC;
	}

	public void setNhaCC(NhaCC nhaCC) {
		this.nhaCC = nhaCC;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

}
