<%@include file="../cabecalhoContas.tag"%>
<div class="panel panel-info">
	<div class="panel-heading">
		<h1>Cadastre Sua Conta</h1>
	</div>
	<div class="panel-body">
		
		
		<form action="contas/cadastraConta" method="post">

				<label for="nomeDaConta">Nome da Conta</label>
				 <input type="text" class="form-control" id="nomeDaConta" name="nome"> 
				
				
				<label for="vencimento">Vencimento</label> 
				<input class="form-control"	id="vecimento" name="vencimento" type="date"> 
				
				<label for="valor">Valor</label>
				<input type="number" class="form-control" id="valor" name="valor" />
				
				<label	for="pago">Pago: </label>
			  	<input type="checkbox" id="pago"class="form" name="pago" />


			<div class="form-group">
				<button type="reset" class="btn btn-danger">Limpar</button>
				<button type="submit" class="btn btn-info">Cadastrar</button>

			</div>
		</form>
	</div>
</div>

<%@include file="../rodapeContas.tag"%>