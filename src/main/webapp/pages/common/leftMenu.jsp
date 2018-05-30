<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="navbar-default sidebar" role="navigation">
	<div class="sidebar-nav navbar-collapse">
		<ul class="nav" id="side-menu">
			<li><a href="/QuanLybanDienThoai/trang-chu"><i
					class="fa fa-home fa-fw nav_icon"></i>Trang chủ</a></li>
			<li><a href="#"><i class="fa fa-laptop nav_icon"></i>Hệ điều
					hành<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value="/hdh/ds"/>">Danh sách</a></li>
					<li><a href="<c:url value="/hdh/them"/>">Thêm</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-indent nav_icon"></i>Nhà
					cung cấp<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value="/ncc/ds"/>">Danh sách</a></li>
					<li><a href="<c:url value="/ncc/them"/>">Thêm</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-mobile nav_icon"></i>Điện
					thoại<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value="/dt/ds"/>">Danh sách</a></li>
					<li><a href="<c:url value="/dt/them"/>">Thêm</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-user nav_icon"></i>Người
					dùng<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="#"><i class="fa fa-user nav_icon"></i>Khách
							hàng<span class="fa arrow"></span></a>
						<ul class="nav nav-third-level">
							<li><a href="<c:url value="/user/ds-kh"/>">Danh sách</a></li>
							<li><a href="<c:url value="/user/them-kh"/>">Thêm</a></li>
						</ul> <!-- /.nav-second-level --></li>
					<li><a href="#"><i class="fa fa-user nav_icon"></i>Nhân
							viên<span class="fa arrow"></span></a>
						<ul class="nav nav-third-level">
							<li><a href="<c:url value="/user/ds-nv"/>">Danh sách</a></li>
							<li><a href="<c:url value="/user/them-nv"/>">Thêm</a></li>
						</ul> <!-- /.nav-second-level --></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-mobile nav_icon"></i>Sản
					phẩm bảo hành<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="<c:url value="/spbh/ds"/>">Danh sách</a></li>
					<li><a href="<c:url value="/spbh/them"/>">Thêm</a></li>
				</ul> <!-- /.nav-second-level --></li>
			<li><a href="#"><i class="fa fa-dollar nav_icon"></i>Lập hoá đơn<span class="fa arrow"></span></a>
				<ul class="nav nav-second-level">
					<li><a href="#"><i class="fa fa-dollar nav_icon"></i>Tạo hoá đơn<span class="fa arrow"></span></a>
						<ul class="nav nav-third-level">
							<li><a href="<c:url value="/hoa-don/ds-hd"/>">Danh sách</a></li>
							<li><a href="<c:url value="/hoa-don/them-hd"/>">Thêm</a></li>
						</ul> <!-- /.nav-second-level --></li>
					<li><a href="#"><i class="fa fa-dollar nav_icon"></i>Nhập hàng<span class="fa arrow"></span></a>
						<ul class="nav nav-third-level">
							<li><a href="<c:url value="/hoa-don/ds-nhap"/>">Danh sách</a></li>
							<li><a href="<c:url value="/hoa-don/them-nhap"/>">Thêm</a></li>
						</ul> <!-- /.nav-second-level --></li>
					<li><a href="#"><i class="fa fa-dollar nav_icon"></i>Mua hàng<span class="fa arrow"></span></a>
						<ul class="nav nav-third-level">
							<li><a href="<c:url value="/hoa-don/ds-mua"/>">Danh sách</a></li>
							<li><a href="<c:url value="/hoa-don/them-mua"/>">Thêm</a></li>
						</ul> <!-- /.nav-second-level --></li>
				</ul> <!-- /.nav-second-level --></li>
		</ul>
	</div>
	<!-- /.sidebar-collapse -->
</div>
