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
@Table(name = "he_dieu_hanh")
public class HeDieuHanh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ten")
	private String ten;
	@OneToMany(mappedBy = "heDieuHanh", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<DienThoai> dienThoais;

	public HeDieuHanh() {
	}

	public HeDieuHanh(int id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
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

	public List<DienThoai> getDienThoais() {
		return dienThoais;
	}

	public void setDienThoais(List<DienThoai> dienThoais) {
		this.dienThoais = dienThoais;
	}

	public DienThoai addProduct(DienThoai dienThoai) {
		getDienThoais().add(dienThoai);
		dienThoai.setHeDieuHanh(this);

		return dienThoai;
	}

	public DienThoai removeProduct(DienThoai dienThoai) {
		getDienThoais().remove(dienThoai);
		dienThoai.setHeDieuHanh(null);

		return dienThoai;
	}
}
