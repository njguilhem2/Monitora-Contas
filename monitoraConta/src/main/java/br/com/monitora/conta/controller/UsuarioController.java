package br.com.monitora.conta.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.monitora.conta.configuration.ConfirmacaoDeLoginForm;
import br.com.monitora.conta.dao.TokenDao;
import br.com.monitora.conta.dao.TokenHelper;
import br.com.monitora.conta.dao.UsuarioDao;
import br.com.monitora.conta.email.EmailNovoUsuario;
import br.com.monitora.conta.email.Mailer;
import br.com.monitora.conta.email.Token;
import br.com.monitora.conta.modelo.Usuario;

@Controller
public class UsuarioController {
	@Autowired
	private TokenHelper tokenHelper;
	@Autowired
	private Mailer mailer;
	
	
	@PostMapping("/login/request")
	public ModelAndView formSolicitacaoDeAcesso() {
		return new ModelAndView("/login/adicionado");
	}
	@PostMapping("/login/request")
	@Transactional
	public ModelAndView solicitacaoDeAcesso(String email) {
		ModelAndView model = new ModelAndView("/login/adicionado");
		Token token = tokenHelper.generateFrom(email);
		mailer.send(new EmailNovoUsuario(token));
		return model;
	}
	@GetMapping("/login/validate")
	public ModelAndView validaLink(@RequestParam("uuid") String uuid) {
		Optional<Token> optionalToken = tokenHelper.getTokenFrom(uuid);
		
		if(!optionalToken.isPresent()) {
			ModelAndView view = new ModelAndView("redirect:/login");
			view.addObject("msg","O token do link utilizado ñ foi encontrado!");
			
			return view;
			
		}
		Token token = optionalToken.get();
		ConfirmacaoDeLoginForm confirmacaoDeLoginForm = new ConfirmacaoDeLoginForm(token);
		
		ModelAndView view = new ModelAndView("login/confirmacao");
		view.addObject("confirmacaoLoginForm",confirmacaoDeLoginForm);
		return view;
		
	
	}
	@PostMapping("login/cadastro")
	public ModelAndView cadastrar(ConfirmacaoDeLoginForm form) {
		ModelAndView modelAndView = new ModelAndView("redirect:acesso");
		
		if(form.isValid()) {
		
			Usuario usuario = form.toUsuario(usuarioDao, enconder);
			usuarioDao.save(usuario);
			modelAndView.addObject("msg","Usuario cadastrado com sucesso!");
			
			return modelAndView;
		}
		modelAndView.addObject("msg","O token do link utilizado não foi encontrado");
		return modelAndView;
	}
	
}
