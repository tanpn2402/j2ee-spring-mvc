package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nha_cc_sdt")
public class NhaCCSDT {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "nha_cc_id")
	private int nhaCCID;
	@Column(name = "sdt")
	private String sdt;

	public NhaCCSDT() {
		super();
	}

	public NhaCCSDT(int id, int nhaCCID, String sdt) {
		super();
		this.id = id;
		this.nhaCCID = nhaCCID;
		this.sdt = sdt;
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

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

}
