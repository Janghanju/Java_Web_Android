<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		kr.bit.Calc c=new kr.bit.Calc();
		int sum=c.hap();
	%>
	<table border="1">
		<tr bgcolor="red">
			<td><%=sum %></td>
		</tr>
	</table>
</body>
</html>