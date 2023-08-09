<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
session = request.getSession();
out.println(session.getAttribute("adh"));
out.println("<br>");
out.println(session.getAttribute("name"));
out.println("<br>");
out.println(session.getAttribute("father"));
out.println("<br>");
out.println(session.getAttribute("state"));
out.println("<br>");
out.println(session.getAttribute("city"));
out.println("<br>");
out.println(session.getAttribute("add"));
out.println("<br>");
out.println(session.getAttribute("dob"));

%>



</body>
</html>