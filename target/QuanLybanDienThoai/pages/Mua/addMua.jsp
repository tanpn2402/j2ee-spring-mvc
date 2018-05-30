<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="xs">
	<c:url value="/hoa-don/them-mua" var="url" />
	<form:form action="${url}" commandName="addMuaForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="hdID">ID Hoá đơn(*)</label>
				<form:select path="hdID" class="form-control1" items="${listHD}"
					itemValue="id" itemLabel="id">
				</form:select>
				<p class="help-block">
					<form:errors path="hdID" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="khachID">Khách hàng(*)</label>
				<form:select class="form-control1" path="khachID">
					<c:forEach items="${listKH }" var="kh">
						<c:forEach items="${listNguoi }" var="nguoi">
							<c:if test="${kh.khNguoiID == nguoi.id }">
								<form:option value="${kh.id }" label="${nguoi.ten }" />
							</c:if>
						</c:forEach>
					</c:forEach>
				</form:select>
				<p class="help-block">
					<form:errors path="khachID" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="dtID">Điện thoại(*)</label>
				<%-- <form:select path="dtID" class="form-control1" items="${listDT}"
					itemValue="id" itemLabel="ten">
				</form:select> --%>
				<form:select class="form-control1" path="dtID">
					<c:forEach items="${listDT }" var="dt">
						<c:forEach items="${listCC }" var="cc">
							<c:if test="${cc.dtID == dt.id }">
								<form:option value="${dt.id }" label="${dt.ten } - ${cc.nhaCCTen }" />
							</c:if>
						</c:forEach>
					</c:forEach>
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