package com.estrella.prueba.java8.proyecto.api.consumoBD.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.request.UserRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.response.UserResponse;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.service.UserService;

@RestController
@RequestMapping("/estrella/apiBD/user")
public class UserController {

	@Autowired
	private UserService service;

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertar")
	public ResponseEntity insertarUser(@RequestBody UserRequest request) {
		try {
			service.insertarUser(request);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/listar")
	public ResponseEntity<List<UserResponse>> listarUser() {
		List<UserResponse> response = new ArrayList<>();
		try {
			response = service.listarUser();
			return new ResponseEntity<List<UserResponse>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<UserResponse>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
