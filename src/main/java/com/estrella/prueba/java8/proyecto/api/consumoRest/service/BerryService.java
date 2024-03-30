package com.estrella.prueba.java8.proyecto.api.consumoRest.service;

import com.estrella.prueba.java8.proyecto.api.consumoRest.response.BerryResponse;

public interface BerryService {

	public BerryResponse getBerry(String identificador) throws Exception;
}
