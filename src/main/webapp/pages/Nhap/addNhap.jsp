<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h3>Thêm HĐ nhập hàng</h3>
<div class="xs">
	<c:url value="/hoa-don/them-nhap" var="url" />
	<form:form action="${url}" commandName="addNhapForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="hdID">ID Hoá đơn(*)</label>
				<form:select path="hdID" class="form-control1"
					items="${listHD}" itemValue="id" itemLabel="id">
				</form:select>
				<p class="help-block">
					<form:errors path="hdID" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nhaCCID">Nhà cung cấp(*)</label>
				<form:select path="nhaCCID" class="form-control1"
					items="${listNCC}" itemValue="id" itemLabel="ten">
				</form:select>
				<p class="help-block">
					<form:errors path="nhaCCID" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="dtID">Điện thoại(*)</label>
				<form:select path="dtID" class="form-control1"
					items="${listDT}" itemValue="id" itemLabel="ten">
				</form:select>
				<p class="help-block">
					<form:errors path="dtID" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="soLuong">Số lượng(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="soLuong" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="soLuong" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group">
				<button type="submit" class="btn btn-success">Thêm</button>
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