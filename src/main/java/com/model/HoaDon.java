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
@Table(name = "hoa_don")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ngay_lap")
	private String ngayLap;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nv_id")
	private NhanVien nhanVien;
	@OneToMany(mappedBy = "hoaDon", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<CungCap> cungCaps;
	@OneToMany(mappedBy = "hoaDon", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Mua> muas;

	public HoaDon() {
	}

	public HoaDon(int id, String ngayLap, NhanVien nhanVien) {
		super();
		this.id = id;
		this.ngayLap = ngayLap;
		this.nhanVien = nhanVien;
	}

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

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
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

}
