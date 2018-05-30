package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguoi_sdt")
public class NguoiSDT {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "nguoi_id")
	private int nguoiID;
	@Column(name = "sdt")
	private String sdt;

	public NguoiSDT() {
	}

	public NguoiSDT(int id, int nguoiID, String sdt) {
		super();
		this.id = id;
		this.nguoiID = nguoiID;
		this.sdt = sdt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNguoiID() {
		return nguoiID;
	}

	public void setNguoiID(int nguoiID) {
		this.nguoiID = nguoiID;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

}
