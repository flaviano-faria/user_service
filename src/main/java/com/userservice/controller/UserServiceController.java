package com.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.userservice.domain.ports.interfaces.UsuarioServicePort;



@RestController
public class UserServiceController {
	
	private UsuarioServicePort usuarioServicePort;
	
	public UserServiceController(UsuarioServicePort usuarioServicePort) {
		this.usuarioServicePort = usuarioServicePort;
	}
	
	
	@PostMapping(value = "/create")
	public void createUser() {
		usuarioServicePort.insertUser(null);
		System.out.println("test");
	}

}
