package br.com.monitora.conta.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
	@GetMapping("/login")
	public String login() {
		return"/login/acesso";
	}
}
