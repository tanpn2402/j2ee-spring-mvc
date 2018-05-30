package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nha_cc_dia_chi")
public class NhaCCDiaChi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "nha_cc_id")
	private int nhaCCID;
	@Column(name = "dia_chi")
	private String diaChi;

	public NhaCCDiaChi() {
		super();
	}

	public NhaCCDiaChi(int id, int nhaCCID, String diaChi) {
		super();
		this.id = id;
		this.nhaCCID = nhaCCID;
		this.diaChi = diaChi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNhaCCID() {
		return nhaCCID;
	}

	public void setNhaCCID(int nhaCCID) {
		this.nhaCCID = nhaCCID;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
