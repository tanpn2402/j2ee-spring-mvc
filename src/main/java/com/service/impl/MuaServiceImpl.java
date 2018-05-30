package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MuaDAO;
import com.dao.DienThoaiDAO;
import com.dao.HoaDonDAO;
import com.dao.KhachDAO;
import com.dao.NguoiDAO;
import com.domain.DienThoaiDTO;
import com.domain.MuaDTO;
import com.model.Mua;
import com.model.Nguoi;
import com.service.MuaService;

@Service
@Transactional
public class MuaServiceImpl implements MuaService {
	@Autowired
	private MuaDAO muaDAO;
	@Autowired
	private HoaDonDAO hoaDonDAO;
	@Autowired
	private DienThoaiDAO dienThoaiDAO;
	@Autowired
	private KhachDAO khachDAO;
	@Autowired
	private NguoiDAO nguoiDAO;

	public List<MuaDTO> getAllMua() {
		List<Mua> list = muaDAO.getAllMua();
		List<Nguoi> listNguoi = nguoiDAO.getAllNguoi();
		List<MuaDTO> muaDTOs = new ArrayList<MuaDTO>();

		for (Mua mua : list) {
			MuaDTO muaDTO = new MuaDTO();
			muaDTO.setId(mua.getId());
			muaDTO.setDtID(mua.getDienThoai().getId());
			muaDTO.setDtTen(mua.getDienThoai().getTen());
			muaDTO.setSoLuong(mua.getSoLuong());
			muaDTO.setHdID(mua.getHoaDon().getId());
			muaDTO.setKhachID(mua.getKhach().getId());
			for (Nguoi nguoi : listNguoi) {
				if (nguoi.getId() == mua.getKhach().getKhNguoiID()) {
					muaDTO.setKhachTen(nguoi.getTen());
				}
			}

			muaDTOs.add(muaDTO);
		}
		return muaDTOs;
	}

	public void addMua(MuaDTO muaDTO) {
		Mua mua = new Mua();
		
		mua.setHoaDon(hoaDonDAO.getHDByID(muaDTO.getHdID()));
		mua.setSoLuong(muaDTO.getSoLuong());
		mua.setDienThoai(dienThoaiDAO.getDTByID(muaDTO.getDtID()));
		mua.setKhach(khachDAO.getKHByID(muaDTO.getKhachID()));

		muaDAO.addMua(mua);
		muaDTO.setId(mua.getId());
	}

	public void editMua(MuaDTO muaDTO) {
		Mua mua = muaDAO.getMuaByID(muaDTO.getId());
		mua.setHoaDon(hoaDonDAO.getHDByID(muaDTO.getHdID()));
		mua.setSoLuong(muaDTO.getSoLuong());
		mua.setDienThoai(dienThoaiDAO.getDTByID(muaDTO.getDtID()));
		mua.setKhach(khachDAO.getKHByID(muaDTO.getKhachID()));

		muaDAO.editMua(mua);
	}

	public void deleteMua(int id) {
		Mua mua = muaDAO.getMuaByID(id);
		if (mua != null) {
			muaDAO.deleteMua(mua);
		}
	}

	public MuaDTO getMuaByID(int id) {
		Mua mua = muaDAO.getMuaByID(id);
		List<Nguoi> listNguoi = nguoiDAO.getAllNguoi();

		MuaDTO muaDTO = new MuaDTO();
		muaDTO.setId(mua.getId());
		muaDTO.setDtID(mua.getDienThoai().getId());
		muaDTO.setDtTen(mua.getDienThoai().getTen());
		muaDTO.setSoLuong(mua.getSoLuong());
		muaDTO.setHdID(mua.getHoaDon().getId());
		muaDTO.setKhachID(mua.getKhach().getId());
		for (Nguoi nguoi : listNguoi) {
			if (nguoi.getId() == mua.getKhach().getKhNguoiID()) {
				muaDTO.setKhachTen(nguoi.getTen());
			}
		}

		return muaDTO;
	}

}
