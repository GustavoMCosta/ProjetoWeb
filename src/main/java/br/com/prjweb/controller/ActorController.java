package br.com.prjweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActorController {
	
	@GetMapping({"/atores/atores"}) //é o nome que eu quiser colocar
	public String home(String username) {
		return "atores/atores"; //é o nome do arquivo real
	}
}
