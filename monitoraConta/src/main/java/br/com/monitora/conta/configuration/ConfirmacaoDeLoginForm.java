package br.com.monitora.conta.configuration;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.monitora.conta.dao.LoginDao;
import br.com.monitora.conta.dao.UsuarioDao;
import br.com.monitora.conta.email.Token;
import br.com.monitora.conta.modelo.Permissao;
import br.com.monitora.conta.modelo.Usuario;

public class ConfirmacaoDeLoginForm {
	private Token token;
	private String senha;
	private String confirmeSenha;
	
	public ConfirmacaoDeLoginForm() {}
	
	public ConfirmacaoDeLoginForm(Token token) {
		this.token = token;
	}
	
	public boolean isValid() {
		return senha.equals(confirmeSenha);
	}
	public Usuario toUsuario(UsuarioDao dao , PasswordEncoder encoder) {
		String encriptedPassword = encoder.encode(this.senha);
		String email = token.getEmail();
		Usuario usuario = dao.findByEmail(email).orElse(novoUsuario(email, encriptedPassword));
		usuario.setSenha(encriptedPassword);
		return usuario;
	}
	private Usuario novoUsuario(String email, String senha) {
		Set<Permissao> permissoes = new HashSet<>();
		permissoes.add(Permissao.USUARIO);
		
		return new Usuario(email, senha, permissoes);
	}
}
