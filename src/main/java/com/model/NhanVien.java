package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nhan_vien")
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nv_nguoi_id")
	private int nvNguoiID;
	@Column(name = "luong")
	private int luong;
	@OneToMany(mappedBy = "nhanVien", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<HoaDon> hoaDons;

	public NhanVien() {
	}

	public NhanVien(int id, int nvNguoiID, int luong) {
		super();
		this.id = id;
		this.nvNguoiID = nvNguoiID;
		this.luong = luong;
	}

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

	public List<HoaDon> getHoaDons() {
		return hoaDons;
	}

	public void setHoaDons(List<HoaDon> hoaDons) {
		this.hoaDons = hoaDons;
	}

}
