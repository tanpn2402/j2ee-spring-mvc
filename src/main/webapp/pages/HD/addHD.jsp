<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h3>Thêm Hóa đơn</h3>
<div class="xs">
	<c:url value="/hoa-don/them-hd" var="url" />
	<form:form action="${url}" commandName="addHDForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="ngayLap">Ngày lập(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="ngayLap" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="ngayLap" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="nvID">Nhân viên(*)</label>
				<form:select class="form-control1" path="nvID">
					<c:forEach items="${listNV }" var="nv">
						<c:forEach items="${listNguoi }" var="nguoi">
							<c:if test="${nv.nvNguoiID == nguoi.id }">
								<form:option value="${nv.id }" label="${nguoi.ten }" />
							</c:if>
						</c:forEach>
					</c:forEach>
				</form:select>
				<p class="help-block">
					<form:errors path="nvID" class="control-label"></form:errors>
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