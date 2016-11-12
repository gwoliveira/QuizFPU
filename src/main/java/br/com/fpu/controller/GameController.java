package br.com.fpu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fpu.entity.Jogador;

@Controller
public class GameController {
	private static final Logger logger = LoggerFactory.getLogger(GameController.class);

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("jogador", new Jogador());
		return "index";
	}

	@PostMapping("/createuser")
	public String createUser(Jogador jogador, Model model) {
		logger.info(jogador.getNome());
		return "redirect:/start";
	}

	@GetMapping("/start")
	public String start(Model model) {
		return "game";
	}

}
