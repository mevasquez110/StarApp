package com.estrella.prueba.java8.proyecto.api.consumoRest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estrella.prueba.java8.proyecto.api.consumoRest.response.BerryResponse;
import com.estrella.prueba.java8.proyecto.api.consumoRest.service.BerryService;
import com.estrella.prueba.java8.proyecto.cliente.rest.RestService;

@Service
public class BerryServiceImpl implements BerryService {

	@Autowired
	private RestService service;

	public BerryResponse getBerry(String identificador) throws Exception {
		return service.getBerry(identificador);
	}

}
