<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h3>Thêm Sản phẩm bảo hành</h3>
<div class="xs">
	<c:url value="/spbh/them" var="url" />
	<form:form action="${url}" commandName="addSPBHForm" method="post">
		<fieldset>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="ten">Tên sản phẩm(*)</label>
				<!-- Danh sach khach hang -->
				<form:select path="ten" class="form-control1" items="${listDT}"
					itemValue="ten" itemLabel="ten">
				</form:select>
				<!-- End -->
				<p class="help-block">
					<form:errors path="ten" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="ngayNhan">Ngày nhận(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="ngayNhan" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="ngayNhan" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="ngayTra">Ngày trả(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="ngayTra" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="ngayTra" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="noiDung">Nội dung(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="noiDung" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="noiDung" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="phi">Phí(*)</label>
				<form:input type="text" class="form-control1" required="required"
					path="phi" onfocus="removeCss(this);" />
				<p class="help-block">
					<form:errors path="phi" class="control-label"></form:errors>
				</p>
			</div>
			<div class="form-group ${status.error ? 'has-error' : ''}">
				<label class="control-label" for="khachID">Khách hàng(*)</label>
				<!-- Danh sach khach hang -->
				<form:select class="form-control1" path="khachID">
					<c:forEach items="${listKH }" var="kh">
						<c:forEach items="${listNguoi }" var="nguoi">
							<c:if test="${kh.khNguoiID == nguoi.id }">
								<form:option value="${kh.id }" label="${nguoi.ten }" />
							</c:if>
						</c:forEach>
					</c:forEach>
				</form:select>
				<!-- End -->
				<p class="help-block">
					<form:errors path="khachID" class="control-label"></form:errors>
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