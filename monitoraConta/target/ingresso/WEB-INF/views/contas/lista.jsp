<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="/assets/css/basico.css">
<title>Lista de Contas</title>
</head>
<body class="container">	
	<div class="table-reponsive">	
			<table class="table table">
				<tr>
					<td class="info">Nome da Conta: </td>
					<td class="info">Vencimento: </td>
					<td class="info">Valor: </td>
					<td class="info">pago: </td>
					<td class="info"></td>
					<td class="info"></td>
				</tr>
				<c:forEach var="conta" items="${contas}">
					<tr>
						<td class="danger">${conta.nome}</td>
						<td class="danger">${conta.vencimento}</td>
						<td class="danger">${conta.valor}</td>
						<td class="danger">${conta.pago}</td>
						<td class="danger">
							<a href="${conta.id}" class="btn btn-danger">remover</a>
						</td>
						<td class="danger"><a href="/${conta.id}/contas" class="btn btn-info">alterar</a>
						</td>
					</tr>
				 </c:forEach>			
			</table>
	</div>
</body>
</html>