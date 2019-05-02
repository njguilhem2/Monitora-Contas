<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Monitora -- Contas</title>
</head>
<body>
	<form action="cadastraConta" method = "post">
				
				<label>Nome da conta: </label>
				<input type="text" name="nome" />
				<label>Vencimento: </label>
				<input type="text" name="vencimento"/><br/>
				<label>Valor: </label>
				<input type="text" name="valor" /><br/>
				<label>Pago: </label>
				<input type="checkbox" name="pago" />
		
		
	
		<input type="submit" />	
	
	
	</form>
</body>
</html>