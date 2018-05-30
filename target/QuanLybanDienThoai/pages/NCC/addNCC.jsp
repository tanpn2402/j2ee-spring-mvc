<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="xs">
	<c:url value="/ncc/them" var="url" />
	<form:form action="${url}" commandName="addNCCForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nhaCCDTO.ten">Tên(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nhaCCDTO.ten" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nhaCCDTO.ten" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nhaCCDiaChiDTO.diaChi">Địa chỉ(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nhaCCDiaChiDTO.diaChi" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nhaCCDiaChiDTO.diaChi" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nhaCCSDTDTO.sdt">SĐT(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="nhaCCSDTDTO.sdt" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="nhaCCSDTDTO.sdt" class="control-label"></form:errors>
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