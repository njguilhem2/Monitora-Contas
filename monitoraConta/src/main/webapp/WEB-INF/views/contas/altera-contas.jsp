<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Conta</title>
</head>
<body>
	
	<form action="updateConta">
		<table>
			<c:forEach var="conta" items="contas">
				<tr>
					<td>${conta.id}</td>
					<td>${conta.nome}</td>
					<td>${conta.vencimento}</td>
					<td>${conta.valor}</td>
					<td>${conta.pago}</td>
				</tr>
			
				
			</c:forEach>
		</table>
	</form>
</body>
</html>