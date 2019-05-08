<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
			<input type="hidden" name="token.uuid" value="${confirmacaoLoginForm.token.uuid}"/>
			<input type="hidden" name="token.email" value="${confirmacaoLoginForm.token.email}"/>
			
			<div class="form-group">
				<label>Senha: </label>
				<input id="password" type="password" class="form-control" />
			</div>
			<div class="form-group">
				<label>Confirmação de senha: </label>
				<input id="confirmSenha" type="password" class="form-control">
			
			</div>
			<button class="btn btn-primary" type="submit">Cadastrar</button>
			
			
			
			</div>
			
	
	
	
	</form>
</body>
</html>