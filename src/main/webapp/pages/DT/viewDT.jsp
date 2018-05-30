<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin điện thoại</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${dt.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Tên</h5></td>
					<td>${dt.ten}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Số lượng</h5></td>
					<td>${dt.soLuong}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Giá nhập</h5></td>
					<td>${dt.giaNhap}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Giá bán</h5></td>
					<td>${dt.giaBan}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Bảo hành</h5></td>
					<td>${dt.bh} &nbsp; năm</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Hệ điều hành</h5></td>
					<td>${dt.hdhTen}</td>
				</tr>
				
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();"> Trở lại</button> 
						<a href="<c:url value ='/dt/sua/${dt.id }'/>" class="btn btn-primary">Sửa</a> 
						<a href="<c:url value ='/dt/xoa/${dt.id }'/>" class="btn btn-danger">Xoá</a> 
						<%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${dt.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>