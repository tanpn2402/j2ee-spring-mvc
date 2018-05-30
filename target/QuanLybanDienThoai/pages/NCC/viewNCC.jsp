<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin nhà cung cấp</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${ncc.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Tên</h5></td>
					<td>${ncc.ten}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Địa chỉ</h5></td>
					<c:forEach items="${listDC }" var="dc">
						<c:if test="${dc.nhaCCID == ncc.id }">
							<td>${dc.diaChi }</td>
						</c:if>
					</c:forEach>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Số điện thoại</h5></td>
					<c:forEach items="${listSDT }" var="sdt">
						<c:if test="${sdt.nhaCCID == ncc.id }">
							<td>${sdt.sdt }</td>
						</c:if>
					</c:forEach>
				</tr>
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();"> Trở lại</button> 
						<%-- <a href="<c:url value ='/ncc/sua/${ncc.id }'/>" class="btn btn-primary">Sửa</a> --%> 
						<a href="<c:url value ='/ncc/xoa/${ncc.id }'/>" class="btn btn-danger">Xoá</a> 
						<%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${ncc.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>