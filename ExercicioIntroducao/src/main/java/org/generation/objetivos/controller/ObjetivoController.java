package org.generation.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ExercicioIntroducao") 
public class ObjetivoController {
	@GetMapping
	
	public String Objetivos () {
		return "Aprender as habilidades práticas da Spring ";
	}
	
}

