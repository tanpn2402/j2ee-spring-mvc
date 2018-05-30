<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%-- <c:url value="/QuanLyBanHang/ncc/detailed-search" var="url" />
<form:form action="${url}" method="get" commandName="searchnccDTO">
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

<h3>Danh sách nhà cung cấp</h3>
<div class="panel panel-success">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Tên</th>
				<th>SĐT</th>
				<th>Địa chỉ</th>
				<th>Tuỳ chọn</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listTen}" var="listTen">
				<c:forEach items="${listSDT}" var="listSDT">
					<c:forEach items="${listDiaChi}" var="listDiaChi">
						<c:if test="${listTen.id == listSDT.nhaCCID }">
							<c:if test="${listTen.id == listDiaChi.nhaCCID }">
								<tr>
									<td>${listTen.id }</td>
									<td>${listTen.ten }</td>
									<td>${listDiaChi.diaChi }</td>
									<td>${listSDT.sdt }</td>
									<td><a href="<c:url value ='/ncc/xem/${listTen.id }'/>"
										class="btn btn-default">Xem</a><%--  <a
										href="<c:url value ='/ncc/sua/${listTen.id }'/>"
										class="btn btn-primary">Sửa</a>  --%><a
										href="<c:url value ='/ncc/xoa/${listTen.id }'/>"
										class="btn btn-danger">Xoá</a> <%-- <button class="btn btn-danger" data-toggle="modal"
							data-target="#myModal" onclick="setId(${list.id})">
							Delete</button> --%></td>
								</tr>
							</c:if>
						</c:if>
					</c:forEach>
				</c:forEach>
			</c:forEach>
		</tbody>
	</table>
</div>