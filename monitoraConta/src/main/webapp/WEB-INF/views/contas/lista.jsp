
	<%@include file="../cabecalhoContas.tag" %>	
	<div class="panel panel-info">
		          <div class="panel-heading">
		           		<h1>Suas Contas</h1>
		          </div>
    	<div class="panel-body">
	<div class="table-reponsive">	
			<table class="table table">
				<tr>
					<td class="info">Nome da Conta: </td>
					<td class="info">Vencimento: </td> 
					<td class="info">Valor: </td>
					<td class="info">pago: </td>
					<td class="info">Remove:</td>
					<td class="info">Altera:</td>
				</tr>
				<c:forEach var="conta" items="${contas}">
					<tr>
						<td class="danger">${conta.nome}</td>
						<td class="danger">${conta.vencimento}</td>
						<td class="danger">${conta.valor}</td>
						<td class="danger">${conta.pago}</td>
						<td class="danger">
							<a href="removeConta?id=${conta.id}" class="btn btn-danger">remover</a>
						</td>
						<td class="danger"><a href="alteraConta?id=${conta.id}" class="btn btn-info">alterar</a>
						</td>
					</tr>
				 </c:forEach>			
			</table>
			</div>
		</div>
	</div>
	
<%@include file="../rodapeContas.tag" %>
