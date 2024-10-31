package com.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.domain.dto.UserDTO;
import com.userservice.domain.ports.interfaces.UsuarioServicePort;



@RestController
public class UserServiceController {
	
	private UsuarioServicePort usuarioServicePort;
	
	public UserServiceController(UsuarioServicePort usuarioServicePort) {
		this.usuarioServicePort = usuarioServicePort;
	}
	
	
	@PostMapping(value = "/create")
	public void createUser(@RequestBody UserDTO userDTO) {
		usuarioServicePort.insertUser(userDTO);
		System.out.println("test");
	}

}
