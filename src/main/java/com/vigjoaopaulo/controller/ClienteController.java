package com.vigjoaopaulo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping
	public String listar() {
		
		return "Ola,  mundo";
	}

}
