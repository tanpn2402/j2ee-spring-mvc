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
@Table(name = "nha_cc")
public class NhaCC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ten")
	private String ten;
	@OneToMany(mappedBy = "nhaCC", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<CungCap> cungCaps;

	public NhaCC() {
	}

	public NhaCC(int id) {
		super();
		this.id = id;
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

	public List<CungCap> getCungCaps() {
		return cungCaps;
	}

	public void setCungCaps(List<CungCap> cungCaps) {
		this.cungCaps = cungCaps;
	}

	//
	// public CungCap addProduct(CungCap cungCap) {
	// getCungCaps().add(cungCap);
	// dienThoai.setNhaCC(this);
	//
	// return dienThoai;
	// }

	// public DienThoai removeProduct(DienThoai dienThoai) {
	// getDienThoais().remove(dienThoai);
	// dienThoai.setNhaCC(null);
	//
	// return dienThoai;
	// }
}
