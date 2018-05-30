<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3>Sửa thông tin Khách hàng</h3>
<div class="xs">
	<c:url value="/user/sua" var="url" />
	<form:form action="${url}" method="post" commandName="editNguoiForm">
		<fieldset>
			<form:hidden path="id" />
			<spring:bind path="nguoiDTO.ten">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiDTO.ten">Tên(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="nguoiDTO.ten" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="nguoiDTO.ten" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="nguoiDTO.gioiTinh">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiDTO.gioiTinh">Giới
						tính(*)</label>
					<form:select path="nguoiDTO.gioiTinh" class="form-control1">
						<form:option value="Nam" label="Nam" />
						<form:option value="Nữ" label="Nữ" />
					</form:select>
					<p class="help-block">
						<form:errors path="nguoiDTO.gioiTinh" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="nguoiDTO.email">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiDTO.email">Email(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="nguoiDTO.email" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="nguoiDTO.email" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="nguoiDTO.namSinh">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiDTO.namSinh">Năm
						sinh(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="nguoiDTO.namSinh" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="nguoiDTO.namSinh" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="nguoiDTO.nguoiType">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiDTO.nguoiType">Loại(*)</label>
					<form:select path="nguoiDTO.nguoiType" class="form-control1">
						<form:option value="NV" label="Nhân viên" />
						<form:option value="KH" label="Khách hàng" />
					</form:select>
					<p class="help-block">
						<form:errors path="nguoiDTO.nguoiType" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="nguoiSDTDTO.sdt">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="nguoiSDTDTO.sdt">SĐT(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="nguoiSDTDTO.sdt" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="nguoiSDTDTO.sdt" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<div class="form-group">
				<button type="submit" class="btn btn-default">Sửa</button>
				<button type="reset" class="btn btn-danger">Hủy</button>
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