package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguoi")
public class Nguoi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ten")
	private String ten;
	@Column(name = "gioi_tinh")
	private String gioiTinh;
	@Column(name = "email")
	private String email;
	@Column(name = "nam_sinh")
	private int namSinh;
	@Column(name = "nguoi_type")
	private String nguoiType;

	public Nguoi() {
	}

	public Nguoi(int id, String ten, String gioiTinh, String email, int namSinh, String nguoiType) {
		super();
		this.id = id;
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.email = email;
		this.namSinh = namSinh;
		this.nguoiType = nguoiType;
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

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getNguoiType() {
		return nguoiType;
	}

	public void setNguoiType(String nguoiType) {
		this.nguoiType = nguoiType;
	}

}
