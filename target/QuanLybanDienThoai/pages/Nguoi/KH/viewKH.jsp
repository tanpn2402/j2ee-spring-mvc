<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h3>Xem thông tin khách hàng</h3>
<div class="xs">
	<fieldset>
		<div class="">
			<table class="table">
				<tr>
					<td class="col-md-3"><h5>ID</h5></td>
					<td>${nguoi.id}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Tên</h5></td>
					<td>${nguoi.ten}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Giới tính</h5></td>
					<td>${nguoi.gioiTinh}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Email</h5></td>
					<td>${nguoi.email}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Năm sinh</h5></td>
					<td>${nguoi.namSinh}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Loại</h5></td>
					<td>${nguoi.nguoiType}</td>
				</tr>
				<tr>
					<td class="col-md-3"><h5>Nghề nghiệp</h5></td>
					<c:forEach items="${listKH }" var="kh">
						<c:if test="${kh.khNguoiID == nguoi.id }">
							<td>${kh.ngheNghiep }&nbsp;</td>
						</c:if>
					</c:forEach>
				</tr>
				<tr>
					<td class="col-md-3"><h5>SĐT</h5></td>
					<td><c:forEach items="${listNguoiSDT }" var="sdt">
							<c:if test="${sdt.nguoiID == nguoi.id }">
								${sdt.sdt } &#44; &nbsp;
							</c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<td class="col-md-3">
						<button class="btn btn-default" onclick="window.history.back();">
							Trở lại</button> <%-- <a href="<c:url value ='/user/sua-kh/${nguoi.id }'/>"
						class="btn btn-primary">Sửa</a> --%> <a
						href="<c:url value ='/user/xoa-kh/${nguoi.id }'/>"
						class="btn btn-danger">Xoá</a> <%-- <button class="btn btn-success" data-toggle="modal"
							data-target="#myModal" onclick="setId(${nguoi.id})">
							Delete</button> --%>
					</td>
					<td></td>
				</tr>
			</table>
		</div>
	</fieldset>
</div>