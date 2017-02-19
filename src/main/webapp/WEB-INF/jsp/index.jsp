<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>测试</title>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/admin.css"
	type="text/css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/js/jquery-1.11.3.min.js"></script>
</head>

<body>
	<div>
		<form action="/login" method="post" accept-charset="utf-8">
			id: <input type="text" name="id" id="id" /> <br>
			
		</form>
	</div>
</body>
</html>
