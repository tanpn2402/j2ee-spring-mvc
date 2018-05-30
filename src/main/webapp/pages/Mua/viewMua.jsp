<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin mua hàng</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${mua.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>ID hoá đơn</h5></td>
					<td>${mua.hdID}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Điện thoại</h5></td>
					<td>${mua.dtTen}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Khách hàng</h5></td>
					<td>${mua.khachTen}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Số lượng</h5></td>
					<td>${mua.soLuong}</td>
				</tr>
				<tr>
					<c:forEach items="${listHD }" var="hd">
						<c:if test="${hd.id == mua.hdID }">
							<td class="col-md-3"><h5>Nhân viên lập</h5></td>
							<td>${hd.nvTen}</td>
						</c:if>
					</c:forEach>
				</tr>
				
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();"> Trở lại</button> 
						<%-- <a href="<c:url value ='/hoa-don/sua-mua/${mua.id }'/>" class="btn btn-primary">Sửa</a>  --%>
						<a href="<c:url value ='/hoa-don/xoa-mua/${mua.id }'/>" class="btn btn-danger">Xoá</a> 
						<%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${hoa-don.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>