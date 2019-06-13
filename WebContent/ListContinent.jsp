<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListContinent</title>
</head>
<body>

		<div align="center"  style="margin-tp: 50px;">

		<table>
		
			<thead>
				<tr>
					<th>continent</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach items="${nomeContinente}" var="c" >
				<tr>
					<td><a href="ListNazioni?continente=${c}">${c}	</a></td>
				</tr> 
				</c:forEach>
				
			</tbody>
		</table>

	</div>


</body>
</html>