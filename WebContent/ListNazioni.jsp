<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nazioni</title>
</head>
<body>
		<div align="center" , style="margin-tp: 50px;">

		<table>
		
			<thead>
				<tr>
					<th>Nazioni</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach items="${nazione}" var="n" >
				<tr>
				<td>${n.nazione}</td>
				<td>${n.popolazione}</td>
				<td><a href="ListCittaServlet?nazione=${n.code}">${n.code}</a></td></tr>
				</c:forEach>
				
			</tbody>
		</table>

	</div>
</body>
</html>