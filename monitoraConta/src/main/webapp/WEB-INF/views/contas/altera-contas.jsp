<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Conta</title>
</head>
<body>
	<%@include file="../cabecalhoContas.tag" %>	
	<div class="panel panel-info">
		          <div class="panel-heading">
		           		<h1>Altere Sua Conta</h1>
		          </div>
    	<div class="panel-body">
					<form action="updateConta" method="post">
		
					<input type="hidden" name="id"  value="${conta.id}" />
					
					<label>Nome Da Conta:</label>
					<input type="text" name="nome" class="form-control" id="nome" value="${conta.nome}"/>
					<label>Vencimento:</label>
					<input type="text" name="vencimento" class="form-control" value="${conta.vencimento}"/>
					<label>Valor Da Conta:</label>
					<input type="text" name="valor" class="form-control" value="${conta.valor}"/>
					<label>Pago?</label>
					<input type="checkbox" name="pago" value="true" ${conta.pago? 'checked' : '' }/><br/>
					
					
					 <div class="form-group">
					 				 <button type="reset" class="btn btn-danger">Limpar</button> 
		                            <button type="submit" class="btn btn-info">Cadastrar</button>                                              
		                                                                        
		             </div>    			
						
									
		 </form>
		</div>
	 </div> 
	<%@include file="../rodapeContas.tag" %>	
