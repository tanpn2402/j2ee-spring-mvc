package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.KhachDAO;
import com.dao.NguoiDAO;
import com.dao.SPBHDAO;
import com.domain.SPBHDTO;
import com.model.Nguoi;
import com.model.SanPhamBaoHanh;
import com.service.SPBHService;

@Service
@Transactional
public class SPBHServiceImpl implements SPBHService {
	@Autowired
	private SPBHDAO spbhdao;
	@Autowired
	private KhachDAO khachDAO;
	@Autowired
	private NguoiDAO nguoiDAO;

	public void addSPBH(SPBHDTO sPBHDTO) {
		SanPhamBaoHanh spbh = new SanPhamBaoHanh();
		spbh.setKhach(khachDAO.getKHByID(sPBHDTO.getKhachID()));
		spbh.setNgayNhan(sPBHDTO.getNgayNhan());
		spbh.setNgayTra(sPBHDTO.getNgayTra());
		spbh.setNoiDung(sPBHDTO.getNoiDung());
		spbh.setPhi(sPBHDTO.getPhi());
		spbh.setTen(sPBHDTO.getTen());

		spbhdao.addSPBH(spbh);
		sPBHDTO.setId(spbh.getId());
	}

	public void editSPBH(SPBHDTO sPBHDTO) {
		SanPhamBaoHanh spbh = spbhdao.getSPBHByID(sPBHDTO.getId());
		spbh.setKhach(khachDAO.getKHByID(sPBHDTO.getKhachID()));
		spbh.setNgayNhan(sPBHDTO.getNgayNhan());
		spbh.setNgayTra(sPBHDTO.getNgayTra());
		spbh.setNoiDung(sPBHDTO.getNoiDung());
		spbh.setPhi(sPBHDTO.getPhi());
		spbh.setTen(sPBHDTO.getTen());

		spbhdao.editSPBH(spbh);
	}

	public void deleteSPBH(int id) {
		SanPhamBaoHanh spbh = spbhdao.getSPBHByID(id);
		if (spbh != null) {
			spbhdao.deleteSPBH(spbh);
		}
	}

	public List<SPBHDTO> getAllSPBH() {
		List<SanPhamBaoHanh> list = spbhdao.getAllSPBH();
		List<SPBHDTO> spbhdtos = new ArrayList<SPBHDTO>();
		List<Nguoi> listNguoi = nguoiDAO.getAllNguoi();
		for (SanPhamBaoHanh sanPhamBaoHanh : list) {
			SPBHDTO spbhdto = new SPBHDTO();
			spbhdto.setId(sanPhamBaoHanh.getId());
			spbhdto.setKhachID(sanPhamBaoHanh.getKhach().getId());
			for (Nguoi nguoi : listNguoi) {
				if(nguoi.getId() == sanPhamBaoHanh.getKhach().getKhNguoiID()){
					spbhdto.setKhachTen(nguoi.getTen());
				}
			}
			spbhdto.setNgayNhan(sanPhamBaoHanh.getNgayNhan());
			spbhdto.setNgayTra(sanPhamBaoHanh.getNgayTra());
			spbhdto.setNoiDung(sanPhamBaoHanh.getNoiDung());
			spbhdto.setPhi(sanPhamBaoHanh.getPhi());
			spbhdto.setTen(sanPhamBaoHanh.getTen());
			
			spbhdtos.add(spbhdto);
		}
		return spbhdtos;
	}

	public SPBHDTO getSPBHByID(int id) {
		SanPhamBaoHanh sanPhamBaoHanh = spbhdao.getSPBHByID(id);
		List<Nguoi> listNguoi = nguoiDAO.getAllNguoi();
		
		SPBHDTO spbhdto = new SPBHDTO();
		spbhdto.setId(sanPhamBaoHanh.getId());
		spbhdto.setKhachID(sanPhamBaoHanh.getKhach().getId());
		for (Nguoi nguoi : listNguoi) {
			if(nguoi.getId() == sanPhamBaoHanh.getKhach().getKhNguoiID()){
				spbhdto.setKhachTen(nguoi.getTen());
			}
		}
		spbhdto.setNgayNhan(sanPhamBaoHanh.getNgayNhan());
		spbhdto.setNgayTra(sanPhamBaoHanh.getNgayTra());
		spbhdto.setNoiDung(sanPhamBaoHanh.getNoiDung());
		spbhdto.setPhi(sanPhamBaoHanh.getPhi());
		spbhdto.setTen(sanPhamBaoHanh.getTen());
		
		return spbhdto;
	}

}
