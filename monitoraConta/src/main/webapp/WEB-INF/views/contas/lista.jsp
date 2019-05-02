
	<%@include file="../cabecalhoContas.tag" %>	
	
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
							<a href="${conta.id}" class="btn btn-danger">remover</a>
						</td>
						<td class="danger"><a href="/${conta.id}/contas" class="btn btn-info">alterar</a>
						</td>
					</tr>
				 </c:forEach>			
			</table>
	</div>
	
<%@include file="../rodapeContas.tag" %>
