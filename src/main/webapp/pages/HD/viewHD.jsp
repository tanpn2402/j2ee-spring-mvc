<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin hoá đơn</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${hoaDon.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Ngày lập</h5></td>
					<td>${hoaDon.ngayLap}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Nhân viên</h5></td>
					<td>${hoaDon.nvTen}</td>
				</tr>
				
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();"> Trở lại</button>
						<%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${hoaDon.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>