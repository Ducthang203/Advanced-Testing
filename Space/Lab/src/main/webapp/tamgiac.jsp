<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/fpoly/tam-giac" method="post">
<input name="a" placeholder="Cạnh a?"><br>
<input name="b" placeholder="Cạnh b?"><br>
<input name="c" placeholder="Cạnh c?"><hr>
<button formaction="/fpoly/dien-tich">Tính diện tích</button>
<button formaction="/fpoly/chu-vi">Tính chu vi</button>
</form>
<h3>${message}</h3>

</body>
</html>