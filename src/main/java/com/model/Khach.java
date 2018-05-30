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
@Table(name = "khach")
public class Khach {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "kh_nguoi_id")
	private int khNguoiID;
	@Column(name = "nghe_nghiep")
	private String ngheNghiep;
	@OneToMany(mappedBy = "khach", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<SanPhamBaoHanh> listSPBH;
	@OneToMany(mappedBy = "khach", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Mua> muas;

	public Khach() {
	}

	public Khach(int id, int khNguoiID, String ngheNghiep) {
		super();
		this.id = id;
		this.khNguoiID = khNguoiID;
		this.ngheNghiep = ngheNghiep;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getKhNguoiID() {
		return khNguoiID;
	}

	public void setKhNguoiID(int khNguoiID) {
		this.khNguoiID = khNguoiID;
	}

	public String getNgheNghiep() {
		return ngheNghiep;
	}

	public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep = ngheNghiep;
	}

	public List<SanPhamBaoHanh> getListSPBH() {
		return listSPBH;
	}

	public void setListSPBH(List<SanPhamBaoHanh> listSPBH) {
		this.listSPBH = listSPBH;
	}

	public List<Mua> getMuas() {
		return muas;
	}

	public void setMuas(List<Mua> muas) {
		this.muas = muas;
	}

}
