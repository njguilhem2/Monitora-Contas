
	<%@ include file="../cabecalhoHomeLogin.tag" %>
    <div class="container">
	    	<div class="panel panel-info">
	                <div class="panel-heading">
	                     <h1>Cadastre-se</h1>
	                </div>
	                <form class="container" action="/login/request" method="POST">
	                    <div class="panel-body">
	                          <label for="login">E-mail</label>
	                          <input id="login" type="text" name="email" class="form-control">
	                    </div>
	                    <button class="btn btn-primary" type="submit">Solicitar Acesso</button>
	                </form>
	                
	        </div>                                     
    </div>
    <%@include file="../rodapeHomeLogin.tag" %>
	
    