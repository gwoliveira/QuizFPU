package br.com.fpu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fpu.repository.ParametrosRepository;

@Controller
public class ParametroController {
	
	@Autowired
	ParametrosRepository parametrosRepo;
	
	@GetMapping("/configuracoes")
	public String index(Model model) {
		model.addAttribute("parametros", parametrosRepo.findAll());
		return "configuracoes";
	}

}
