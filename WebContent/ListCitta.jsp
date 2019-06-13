<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My SQL</title>
</head>
<body>

	<div align="center" , style="margin-tp: 50px;">

		<table>
		
			<thead>
				<tr>
					<th>città</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach items="${citta}" var="c" >
				
				<tr>
					<td><a href="Eliminare?code=${c.id}">elimina</a>${c.id}</td>
					<td>${c.popolazione}</td>
					<td>${c.citta}</td>
					
					<td><a href="ListContinent">torna alla pagine dei continenti</a></td>
				</tr> 
                       
				</c:forEach>
				
			</tbody>
		</table>

	</div>


</body>
</html>