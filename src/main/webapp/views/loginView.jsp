<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="login">
	Tài khoản:<input type="text" name="userName"required="required"/>
	Mật khẩu:<input type="text" name="password"required="required"/>
	<input type="submit" value = "Đăng nhập"/>
	<a href ="${pageContext.request.contextPath}">Bỏ qua</a>
</form>
</body>
</html>