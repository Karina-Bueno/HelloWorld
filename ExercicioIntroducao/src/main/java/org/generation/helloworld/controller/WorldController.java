package org.generation.helloworld.controller;


import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ExercicioIntroducao")
public class WorldController {
	
	@GetMapping
	public String hello() {
		return "Hello World!!! :)";
	}
	
}