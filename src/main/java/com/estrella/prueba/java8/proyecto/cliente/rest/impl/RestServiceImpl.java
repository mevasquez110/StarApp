package com.estrella.prueba.java8.proyecto.cliente.rest.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.estrella.prueba.java8.proyecto.api.consumoRest.response.BerryResponse;
import com.estrella.prueba.java8.proyecto.cliente.rest.RestService;

@Service
public class RestServiceImpl implements RestService {

	public BerryResponse getBerry(String identificador) throws Exception {
		BerryResponse response = new BerryResponse();
		String url = "https://pokeapi.co/api/v2/berry/" + identificador;
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<BerryResponse> responseEntity = restTemplate.getForEntity(url, BerryResponse.class);

		if (responseEntity != null && responseEntity.getBody() != null) {
			response = responseEntity.getBody();
		}

		return response;
	}
}
