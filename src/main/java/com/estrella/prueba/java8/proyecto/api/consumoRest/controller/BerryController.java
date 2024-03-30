package com.estrella.prueba.java8.proyecto.api.consumoRest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estrella.prueba.java8.proyecto.api.consumoRest.response.BerryResponse;
import com.estrella.prueba.java8.proyecto.api.consumoRest.service.BerryService;

@RestController
@RequestMapping("/estrella/apiRest")
public class BerryController {

	@Autowired
	private BerryService service;

	@GetMapping(value = "/berry/{id}")
	public ResponseEntity<BerryResponse> getBerry(@PathVariable("id") String identificador) {
		BerryResponse response = new BerryResponse();
		try {
			return new ResponseEntity<BerryResponse>(service.getBerry(identificador), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<BerryResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
