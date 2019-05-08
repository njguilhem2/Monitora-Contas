package br.com.monitora.conta.email;

public class EmailNovoUsuario implements Email{
	private final Token token;
	
	public EmailNovoUsuario(Token token) {
		this.token =token;
	}
	

	@Override
	public String getTo() {
		
		return token.getEmail();
	}

	@Override
	public String getBody() {
		// TODO Auto-generated method stub
		StringBuilder body = new StringBuilder("<html>");
		body.append("<body");
		body.append("<h2>Bem vindo</h2");
		body.append(String.format("Acesso o <a href=%s>link</a> para criar seu login no sistema de ingressos", makeURL()));
		body.append("</body>");
		body.append("</html>");
		
		return body.toString();
	}

	@Override
	public String getSubject() {
		
		return "Cadastro Monitora Contas";
	}
	private String makeURL() {
		return String.format("http://localhost:8080/login/validate?uuid=%s",token.getUuid());
	}

}
