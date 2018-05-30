package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.HoaDonDAO;
import com.dao.NguoiDAO;
import com.dao.NhanVienDAO;
import com.domain.HoaDonDTO;
import com.model.HoaDon;
import com.model.Nguoi;
import com.service.HoaDonService;

@Service
@Transactional
public class HoaDonServiceImpl implements HoaDonService {
	@Autowired
	private HoaDonDAO hoaDonDAO;
	@Autowired
	private NhanVienDAO nhanVienDAO;
	@Autowired
	private NguoiDAO nguoiDAO;

	public void addHD(HoaDonDTO hoaDonDTO) {
		HoaDon hd = new HoaDon();
		hd.setNgayLap(hoaDonDTO.getNgayLap());
		hd.setNhanVien(nhanVienDAO.getNVByID(hoaDonDTO.getNvID()));

		hoaDonDAO.addHD(hd);
		hoaDonDTO.setId(hd.getId());
	}

	public void editHD(HoaDonDTO hoaDonDTO) {
		HoaDon hd = hoaDonDAO.getHDByID(hoaDonDTO.getId());
		hd.setNgayLap(hoaDonDTO.getNgayLap());
		hd.setNhanVien(nhanVienDAO.getNVByID(hoaDonDTO.getNvID()));

		hoaDonDAO.editHD(hd);
	}

	public void deleteHD(int id) {
		HoaDon hd = hoaDonDAO.getHDByID(id);
		if (hd != null) {
			hoaDonDAO.deleteHD(hd);
		}
	}

	public List<HoaDonDTO> getAllHD() {
		List<HoaDon> list = hoaDonDAO.getAllHD();
		List<Nguoi> listNguoi = nguoiDAO.getAllNguoi();
		List<HoaDonDTO> hoaDonDTOs = new ArrayList<HoaDonDTO>();
		for (HoaDon hoaDon : list) {
			HoaDonDTO hdd = new HoaDonDTO();
			hdd.setId(hoaDon.getId());
			hdd.setNgayLap(hoaDon.getNgayLap());
			hdd.setNvID(hoaDon.getNhanVien().getId());
			for (Nguoi nguoi : listNguoi) {
				if(hoaDon.getNhanVien().getNvNguoiID() == nguoi.getId()){
					hdd.setNvTen(nguoi.getTen());
				}
			}
			hoaDonDTOs.add(hdd);
		}
		
		return hoaDonDTOs;
	}

	public HoaDonDTO getHDByID(int id) {
		HoaDon hoaDon = hoaDonDAO.getHDByID(id);
		List<Nguoi> listNguoi = nguoiDAO.getAllNguoi();
		
		HoaDonDTO hdd = new HoaDonDTO();
		hdd.setId(hoaDon.getId());
		hdd.setNgayLap(hoaDon.getNgayLap());
		hdd.setNvID(hoaDon.getNhanVien().getId());
		for (Nguoi nguoi : listNguoi) {
			if(hoaDon.getNhanVien().getNvNguoiID() == nguoi.getId()){
				hdd.setNvTen(nguoi.getTen());
			}
		}
		return hdd;
	}

}
