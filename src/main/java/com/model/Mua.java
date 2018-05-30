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
@Table(name = "mua")
public class Mua {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dt_id")
	private DienThoai dienThoai;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kh_id")
	private Khach khach;
	@Column(name = "so_luong")
	private int soLuong;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hd_id")
	private HoaDon hoaDon;

	public Mua(int id, DienThoai dienThoai, Khach khach, int soLuong, HoaDon hoaDon) {
		super();
		this.id = id;
		this.dienThoai = dienThoai;
		this.khach = khach;
		this.soLuong = soLuong;
		this.hoaDon = hoaDon;
	}

	public Mua() {
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

	public Khach getKhach() {
		return khach;
	}

	public void setKhach(Khach khach) {
		this.khach = khach;
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
