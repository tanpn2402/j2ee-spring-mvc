<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin sản phẩm bảo hành</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${spbh.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Tên</h5></td>
					<td>${spbh.ten}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Ngày nhận</h5></td>
					<td>${spbh.ngayNhan}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Ngày trả</h5></td>
					<td>${spbh.ngayTra}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Nội dung</h5></td>
					<td>${spbh.noiDung}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Phí (Đơn vị: nghìn đồng)</h5></td>
					<td>${spbh.phi}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Khách hàng</h5></td>
					<td>${spbh.khachTen}</td>
				</tr>
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();"> Trở lại</button> 
						<a href="<c:url value ='/spbh/sua/${spbh.id }'/>" class="btn btn-primary">Sửa</a> 
						<a href="<c:url value ='/spbh/xoa/${spbh.id }'/>" class="btn btn-danger">Xoá</a> 
						<%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${spbh.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>