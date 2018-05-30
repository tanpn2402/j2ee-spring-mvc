<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin hệ điều hành</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${hdh.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Tên</h5></td>
					<td>${hdh.ten}</td>
				</tr>
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();"> Trở lại</button> 
						<a href="<c:url value ='/hdh/sua/${hdh.id }'/>" class="btn btn-primary">Sửa</a> 
						<a href="<c:url value ='/hdh/xoa/${hdh.id }'/>" class="btn btn-danger">Xoá</a> 
						<%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${hdh.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>