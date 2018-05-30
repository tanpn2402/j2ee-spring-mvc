<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h3>Thêm HĐH</h3>
<div class="xs">
	<c:url value="/hdh/them" var="url" />
	<form:form action="${url}" commandName="addHDHForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="ten">Tên(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="ten" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="ten" class="control-label"></form:errors>
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