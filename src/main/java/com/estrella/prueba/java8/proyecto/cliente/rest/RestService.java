package com.estrella.prueba.java8.proyecto.cliente.rest;

import com.estrella.prueba.java8.proyecto.api.consumoRest.response.BerryResponse;

public interface RestService {
	
	public BerryResponse getBerry(String identificador) throws Exception;

}
