package com.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.domain.dto.UserDTO;
import com.userservice.ports.interfaces.UsuarioServicePort;

@RestController
public class UsuarioController {
	
	private final UsuarioServicePort usuarioServicePort;
	
	public UsuarioController(UsuarioServicePort usuarioServicePort) {
		this.usuarioServicePort = usuarioServicePort;
	}
	
	@PostMapping
	public void criarUsuario(@RequestBody UserDTO usuarioDTO) {
		usuarioServicePort.insertUser(usuarioDTO);
	}

}
