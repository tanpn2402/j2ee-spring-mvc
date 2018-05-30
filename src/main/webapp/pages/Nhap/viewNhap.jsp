<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin nhập hàng</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${cc.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>ID hoá đơn</h5></td>
					<td>${cc.hdID}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Điện thoại</h5></td>
					<td>${cc.dtTen}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Nhà cung cấp</h5></td>
					<td>${cc.nhaCCTen}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Số lượng</h5></td>
					<td>${cc.soLuong}</td>
				</tr>
				<tr>
					<c:forEach items="${listHD }" var="hd">
						<c:if test="${hd.id == cc.hdID }">
							<td class="col-md-3"><h5>Nhân viên lập</h5></td>
							<td>${hd.nvTen}</td>
						</c:if>
					</c:forEach>
				</tr>

				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();">
							Trở lại</button> <a href="<c:url value ='/hoa-don/sua-nhap/${cc.id }'/>"
						class="btn btn-primary">Sửa</a> <a
						href="<c:url value ='/hoa-don/xoa-nhap/${cc.id }'/>"
						class="btn btn-danger">Xoá</a> <%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${hoa-don.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>