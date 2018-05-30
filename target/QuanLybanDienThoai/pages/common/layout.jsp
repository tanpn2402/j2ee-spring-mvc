<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />"
	type="text/css" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />"
	type="text/css" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/custom.css" />" type="text/css" />
<link rel="stylesheet"
	href="<c:url value="/resources/css/font-awesome.css" />"
	type="text/css" />
<link rel="stylesheet" href="<c:url value="/resources/css/lines.css" />"
	type="text/css" />
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900'
	rel='stylesheet' type='text/css'>

<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/custom.js" />"></script>
<script src="<c:url value="/resources/js/d3.v3.js" />"></script>
<script src="<c:url value="/resources/js/metisMenu.min.js" />"></script>
<script src="<c:url value="/resources/js/rickshaw.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cửa hàng ABC</title>
</head>
<body>
	<div id="wrapper">
		<!-- Navigation -->
		<nav class="top1 navbar navbar-default navbar-static-top"
			role="navigation" style="margin-bottom: 0">
			<tiles:insertAttribute name="header" />
			<tiles:insertAttribute name="leftMenu" />
		</nav>
		<div id="page-wrapper">
			<div class="graphs">
				<tiles:insertAttribute name="body" />
				<tiles:insertAttribute name="footer" />
				<div id="loader"></div>
			</div>
		</div>
		<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->
	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>