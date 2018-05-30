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
@Table(name = "san_pham_bao_hanh")
public class SanPhamBaoHanh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "ten_sp")
	private String ten;
	@Column(name = "ngay_nhan")
	private String ngayNhan;
	@Column(name = "ngay_tra")
	private String ngayTra;
	@Column(name = "noi_dung")
	private String noiDung;
	@Column(name = "phi")
	private int phi;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kh_id")
	private Khach khach;

	public SanPhamBaoHanh() {
	}

	public SanPhamBaoHanh(int id, String ten, String ngayNhan, String ngayTra, String noiDung, int phi, Khach khach) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngayNhan = ngayNhan;
		this.ngayTra = ngayTra;
		this.noiDung = noiDung;
		this.phi = phi;
		this.khach = khach;
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

	public String getNgayNhan() {
		return ngayNhan;
	}

	public void setNgayNhan(String ngayNhan) {
		this.ngayNhan = ngayNhan;
	}

	public String getNgayTra() {
		return ngayTra;
	}

	public void setNgayTra(String ngayTra) {
		this.ngayTra = ngayTra;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public int getPhi() {
		return phi;
	}

	public void setPhi(int phi) {
		this.phi = phi;
	}

	public Khach getKhach() {
		return khach;
	}

	public void setKhach(Khach khach) {
		this.khach = khach;
	}

}
