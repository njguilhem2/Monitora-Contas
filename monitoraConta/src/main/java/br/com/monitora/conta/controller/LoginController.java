package br.com.monitora.conta.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.monitora.conta.dao.UsuarioDao;
import br.com.monitora.conta.modelo.Usuario;
@Controller
public class LoginController {
	@GetMapping("loginForm")
	public String loginForm() {
		return "/login/formulario-login";
	}
	@PostMapping("efetua-login")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if(new UsuarioDao().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado",	usuario);
			return	"../contas/lista";
		}
		return "redirect:/login/loginForm";
	}
}
