<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Citta2</th>
			</tr>
		</thead>

		<tbody>

			<c:forEach items="${citta}" var="c">

				<tr>
					<td>${c.citta}</td>
					<td>${c.popolazione}</td>
				</tr>

			</c:forEach>

		</tbody>
	</table>

</body>
</html>