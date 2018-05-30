package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dien_thoai")
public class DienThoai {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ten")
	private String ten;
	@Column(name = "so_luong")
	private int soLuong;
	@Column(name = "gia_nhap")
	private String giaNhap;
	@Column(name = "gia_ban")
	private String giaBan;
	@Column(name = "bh")
	private int bh;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hdh_id")
	private HeDieuHanh heDieuHanh;
	@OneToMany(mappedBy = "nhaCC", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<CungCap> cungCaps;
	@OneToMany(mappedBy = "dienThoai", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Mua> muas;

	public DienThoai() {
	}

	public DienThoai(int id, String ten, int soLuong, String giaNhap, String giaBan, int bh, HeDieuHanh heDieuHanh) {
		super();
		this.id = id;
		this.ten = ten;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.bh = bh;
		this.heDieuHanh = heDieuHanh;
		// this.nhaCC = nhaCC;
	}

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

	public HeDieuHanh getHeDieuHanh() {
		return heDieuHanh;
	}

	public void setHeDieuHanh(HeDieuHanh heDieuHanh) {
		this.heDieuHanh = heDieuHanh;
	}

	public List<CungCap> getCungCaps() {
		return cungCaps;
	}

	public void setCungCaps(List<CungCap> cungCaps) {
		this.cungCaps = cungCaps;
	}

	public List<Mua> getMuas() {
		return muas;
	}

	public void setMuas(List<Mua> muas) {
		this.muas = muas;
	}

	// public NhaCC getNhaCC() {
	// return nhaCC;
	// }
	//
	// public void setNhaCC(NhaCC nhaCC) {
	// this.nhaCC = nhaCC;
	// }

}
