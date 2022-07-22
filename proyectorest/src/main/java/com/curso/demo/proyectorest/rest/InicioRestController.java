package com.curso.demo.proyectorest.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InicioRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Bienvenido curso Spring Boot ," + LocalDateTime.now(); 
	}
	
	@GetMapping("/entrenar")
	public String sayWorkOut() {
		return "Correr 5 km"; 
	}
	
	@GetMapping("/suerte")
	public String sayFortune() {
		return "Hoy es tu día de Suerte!!!"; 
	}

}
