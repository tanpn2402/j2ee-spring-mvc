<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="xs">
	<c:url value="/user/them-kh" var="url" />
	<form:form action="${url}" commandName="addNguoiForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nguoiDTO.ten">Tên(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nguoiDTO.ten" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nguoiDTO.ten" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nguoiDTO.gioiTinh">Giới
					tính(*)</label>
				<form:select path="nguoiDTO.gioiTinh" class="form-control1">
					<form:option value="Nam" label="Nam" />
					<form:option value="Nu" label="Nữ" />
				</form:select>
				<p class="help-block">
					<form:errors path="nguoiDTO.gioiTinh" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nguoiDTO.email">Email(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nguoiDTO.email" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nguoiDTO.email" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nguoiDTO.namSinh">Năm
					sinh(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nguoiDTO.namSinh" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nguoiDTO.namSinh" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<input name="nguoiDTO.nguoiType" type="hidden" value="KH"/>
				<p class="help-block">
					<form:errors path="nguoiDTO.nguoiType" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nguoiSDTDTO.sdt">SĐT(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nguoiSDTDTO.sdt" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nguoiSDTDTO.sdt" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="khachDTO.ngheNghiep">Nghề nghiệp</label>
				<form:input type="text" class="form-control1" required="required"
					path="khachDTO.ngheNghiep" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="khachDTO.ngheNghiep" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-success">Add</button>
				<button type="reset" class="btn btn-warning">Reset</button>
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