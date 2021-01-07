<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>인덱스 페이지입니다.</h1>
</body>
</html>

<%
	RequestDispatcher dis = request.getRequestDispatcher("board?cmd=list");
	dis.forward(request, response); // 톰켓이 생성하는 request와 response를 재사용한다. 다시 접근하는게 아니라 내부적으로 움직인다는 뜻.
%>
