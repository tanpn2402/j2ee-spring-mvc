<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h3>Sửa thông tin điện thoại</h3>
<div class="xs">
	<c:url value="/dt/sua" var="url" />
	<form:form action="${url}" method="post" commandName="editDTForm">
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
			<spring:bind path="soLuong">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="soLuong">Số lượng(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="soLuong" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="soLuong" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="giaNhap">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="giaNhap">Giá nhập(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="giaNhap" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="giaNhap" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="giaBan">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="giaBan">Giá bán(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="giaBan" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="giaBan" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="bh">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="bh">Bảo hành (năm)(*)</label>
					<form:input type="text" class="form-control1" required="required"
						path="bh" onfocus="removeCss(this);" />
					<p class="help-block">
						<form:errors path="bh" class="control-label"></form:errors>
					</p>
				</div>
			</spring:bind>
			<spring:bind path="hdhID">
				<div class="form-group ${status.error ? 'has-error' : ''}">
					<label class="control-label" for="hdhID">Hệ điều hành(*) </label>
					<form:select path="hdhID" class="form-control1" items="${listHDH}"
						itemValue="id" itemLabel="ten">
					</form:select>
					<p class="help-block">
						<form:errors path="hdhID" class="control-label"></form:errors>
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