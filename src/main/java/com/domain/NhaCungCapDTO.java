package com.domain;

import java.io.Serializable;

public class NhaCungCapDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private NhaCCDTO nhaCCDTO;
	private NhaCCDiaChiDTO nhaCCDiaChiDTO;
	private NhaCCSDTDTO nhaCCSDTDTO;

	public NhaCCDTO getNhaCCDTO() {
		return nhaCCDTO;
	}

	public void setNhaCCDTO(NhaCCDTO nhaCCDTO) {
		this.nhaCCDTO = nhaCCDTO;
	}

	public NhaCCDiaChiDTO getNhaCCDiaChiDTO() {
		return nhaCCDiaChiDTO;
	}

	public void setNhaCCDiaChiDTO(NhaCCDiaChiDTO nhaCCDiaChiDTO) {
		this.nhaCCDiaChiDTO = nhaCCDiaChiDTO;
	}

	public NhaCCSDTDTO getNhaCCSDTDTO() {
		return nhaCCSDTDTO;
	}

	public void setNhaCCSDTDTO(NhaCCSDTDTO nhaCCSDTDTO) {
		this.nhaCCSDTDTO = nhaCCSDTDTO;
	}

}
