package org.generation.bsm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ExercicioIntroducao")
public class BSMController {
	@GetMapping
	
	public String Mentalidades () {
		return "Mentalidade de Crescimento, Persistencia, Responsabilidade Pessoal, Orientação ao Futuro, Comunicação, Orientação aos Dtalhes, "
				+ "Proatividade, Trabalho em Equipe.";
	}
	
}
