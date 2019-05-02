package br.com.monitora.conta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.monitora.conta.dao.LoginDao;
import br.com.monitora.conta.modelo.Login;

@Controller
public class LoginController {
	@Autowired
	LoginDao loginDao;
		
	
	@PostMapping("/login/cadastraUsuario")
	@Transactional
	public String cadastraUsuario(Login login) {
		loginDao.salva(login);
		return "redirect:/login/acesso";
	}
	
	//Security
	@RequestMapping("/login/acesso")
	public String login() {
		return "/login/acesso";
	}
	@RequestMapping("/login/cadastro")
	public String cadastroLogin() {
		return"/login/cadastro";
	}
}
