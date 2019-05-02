
	<%@ include file="../cabecalhoHomeLogin.tag" %>
    <div class="container">
	    	<div class="panel panel-info">
	                <div class="panel-heading">
	                     <h1>Cadastre-se</h1>
	                </div>
	                <form class="container" action="cadastraUsuario" method="POST">
	                    <div class="panel-body">
	                            <div class="form-group">
	                            <label for="nome">Nome</label>
	                            <input type="text" class="form-control" id="nome" placeholder="Nome" name="nome">
	                            </div>
	                            <div class="form-group">
	                            <label for="exampleInputPassword1">Password</label>
	                            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
	                            </div>
	                                <label for="exampleInputEmail1">Email</label>
	                            <div class="form-group input-group">
	                                    <span class="input-group-addon">@</span>
	                                    <input type="text" class="form-control" id="inputGroupSuccess1" aria-describedby="inputGroupSuccess1Status" name="email">
	                            </div>
	                            
	                      
	                            <button type="submit" class="btn btn-info">Cadastrar</button>
	                    </div>
	                </form>
	                
	        </div>                                     
    </div>
    <%@include file="../rodapeHomeLogin.tag" %>
	
    