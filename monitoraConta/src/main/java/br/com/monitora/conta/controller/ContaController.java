package br.com.monitora.conta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.monitora.conta.dao.ContaDao;
import br.com.monitora.conta.modelo.Conta;

@Controller
public class ContaController {

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
	public ModelAndView grava(@Valid Conta conta,BindingResult result) {
		
		if(result.hasErrors()) {
			ModelAndView retorna = new ModelAndView("redirect:/");
			
			return retorna;
		} 
		ModelAndView model = new ModelAndView("redirect:/lista");
		contaDao.salva(conta);
		return model;
	}

	@GetMapping("/lista")
	public ModelAndView lista() {
		ModelAndView model = new ModelAndView("/contas/lista");
		List<Conta> contas = contaDao.lista();
		model.addObject("contas", contas);
		return model;
	}
	
	@GetMapping("/removeConta")
	@Transactional
	public String remove(Integer id) {
		contaDao.delete(id);
		return "redirect:/lista";
	}


	@GetMapping("/alteraConta")
	public String edit(Integer id, Model model) {
		model.addAttribute("conta",contaDao.findOne(id));
		
		return "/contas/altera-contas";
		
	} 
	@PostMapping("/updateConta")
	@Transactional
	public ModelAndView listaAltera(Conta conta) {
			ModelAndView model = new ModelAndView("redirect:/lista");
			contaDao.alterar(conta);
			return model;
			
	}
	
	
 

}
