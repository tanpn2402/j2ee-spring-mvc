<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3>Sửa thông tin nhân viên</h3>
<div class="xs">
	<c:url value="/user/sua-nv" var="url" />
	<form:form action="${url}" method="post" commandName="editNguoiForm">
		<fieldset>
			<form:hidden path="id" />
			<spring:bind path="ten">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="ten">Tên(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="ten" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="ten" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="gioiTinh">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="gioiTinh">Giới tính(*)</label>
					<form:select path="gioiTinh" class="form-control1">
						<form:option value="Nam" label="Nam" />
						<form:option value="Nữ" label="Nữ" />
					</form:select>
					<p class="help-block">
						<form:errors path="gioiTinh" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="email">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="email">Email(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="email" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="email" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="namSinh">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="namSinh">Năm sinh(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="namSinh" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="namSinh" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="nguoiType">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiType">Loại(*)</label>
					<form:select path="nguoiType" class="form-control1">
						<form:option value="NV" label="Nhân viên" />
						<form:option value="KH" label="Khách hàng" />
					</form:select>
					<p class="help-block">
						<form:errors path="nguoiType" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<%-- <spring:bind path="sdt">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="sdt">SĐT(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="sdt" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="sdt" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind> --%>
			<div class="form-group">
				<button type="submit" class="btn btn-default">Sửa</button>
				<button type="reset" class="btn btn-primary">Reset</button>
				<%-- <a href="<c:url value ='/user/sua-sdt/${nguoi.id }'/>"
					class="btn btn-primary">Sửa SĐT</a><a
					href="<c:url value ='/user/sua-nv-luong/${nguoi.id }'/>"
					class="btn btn-primary">Sửa mức lương</a> --%>
			</div>
		</fieldset>
	</form:form>
</div>

<script type="text/javascript">
	function removeCss(t) {
		$(t).parent().removeClass('has-error');
		$(t).parent().find('.help-block').remove();
	}
</script>