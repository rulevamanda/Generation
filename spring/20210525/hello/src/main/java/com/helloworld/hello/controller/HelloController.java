package com.helloworld.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public ResponseEntity<String> Atividade1(){
		return ResponseEntity.status(400).body("muuuita persistência e comunicação");
	}
	
	@GetMapping("/rota2")
	public ResponseEntity<String> Atividade2(){
		return ResponseEntity.status(400).body("aprender a usar o spring boot");
	}

}
