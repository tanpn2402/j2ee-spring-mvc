<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%-- <c:url value="/QuanLyBanHang/NCC/detailed-search" var="url" />
<form:form action="${url}" method="get" commandName="searchNCCDTO">
	<fieldset>
		<div class="form-group">
			<div class="col-sm-6">
				Name: 
				<form:input type="text" class="form-control1" required="required"
					path="name" placeholder='name' />
				<form:hidden path="page" />
			</div>
			<div class="col-sm-6">
				<button type="button" onclick="submitForm();"
					class="btn btn-primary">
					Search
				</button>
			</div>
		</div>
	</fieldset>
</form:form> --%>

<h3>Danh sách khách hàng</h3>
<div class="panel panel-success">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Tên</th>
				<th>Giới tính</th>
				<th>Email</th>
				<th>Năm sinh</th>
				<th>SĐT</th>
				<th>Nghề nghiệp</th>
				<th>Tuỳ chọn</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listNguoi }" var="nguoi">
				<c:if test="${nguoi.nguoiType == 'KH' }">
					<tr>
						<td><c:forEach items="${listKH }" var="kh">
								<c:if test="${kh.khNguoiID == nguoi.id }">
								${kh.id } &nbsp;
							</c:if>
							</c:forEach></td>
						<td>${nguoi.ten }</td>
						<td>${nguoi.gioiTinh }</td>
						<td>${nguoi.email }</td>
						<td>${nguoi.namSinh }</td>
						<td><c:forEach items="${listNguoiSDT }" var="sdt">
								<c:if test="${sdt.nguoiID == nguoi.id }">
								${sdt.sdt } &#44; &nbsp;
							</c:if>
							</c:forEach></td>
						<td><c:forEach items="${listKH }" var="kh">
								<c:if test="${kh.khNguoiID == nguoi.id }">
								${kh.ngheNghiep } &nbsp;
							</c:if>
							</c:forEach></td>
						<td><a href="<c:url value ='/user/xem-kh/${nguoi.id }'/>"
							class="btn btn-default">Xem</a><%--  <a
							href="<c:url value ='/user/sua-kh/${nguoi.id }'/>"
							class="btn btn-primary">Sửa</a> --%> <a
							href="<c:url value ='/user/xoa-kh/${nguoi.id }'/>"
							class="btn btn-danger">Xoá</a> <%-- <button class="btn btn-danger" data-toggle="modal"
							data-target="#myModal" onclick="setId(${nguoi.id})">
							Delete</button> --%></td>
					</tr>
				</c:if>
			</c:forEach>
		</tbody>
	</table>
</div>