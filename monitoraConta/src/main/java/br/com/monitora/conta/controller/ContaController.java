package br.com.monitora.conta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.monitora.conta.dao.ContaDao;
import br.com.monitora.conta.modelo.Conta;

@Controller
public class ContaController {
//	ctrl + shift c para comentar 

	@Autowired
	private ContaDao contaDao;

	@RequestMapping("/")
	public String index() {
		return "/contas/adiciona-contas";
	}
	
	@RequestMapping("/contas/altera-contas")
	public String alteraContas() {
		return "/contas/altera-contas";
	}
	
	
	@PostMapping("contas/cadastraConta")
	@Transactional
	public ModelAndView grava(Conta conta) {
		ModelAndView model = new ModelAndView("redirect:/lista");
		contaDao.salva(conta);
		return model;
	}

	@GetMapping("/lista")
	public ModelAndView lista() {
		ModelAndView model = new ModelAndView("/contas/lista");
		model.addObject("contas", contaDao.lista());
		return model;
	}
	
	@GetMapping("/{id}")
	@Transactional
	public String remove(@PathVariable("id") Integer id) {
		contaDao.delete(id);
		return "redirect:/lista";
	}

	
	//Tentei deste jeito,mas tmb ñ deu certo
//	@GetMapping("/{id}/contas")
//	@Transactional
//	public ModelAndView altera(@PathVariable("id") Integer id) {
//
//		ModelAndView model = new ModelAndView("redirect:/contas/altera-contas");
//		model.addObject("contas", contaDao.altera(id));
//		return model;
//	}
	@GetMapping("/{id}/contas")
	@Transactional
	public ModelAndView altera(@PathVariable("id") Integer id) {

		ModelAndView model = new ModelAndView("redirect:/contas/altera-contas");
		model.addObject("contas", contaDao.findOne(id));
		return model;
	}

}
