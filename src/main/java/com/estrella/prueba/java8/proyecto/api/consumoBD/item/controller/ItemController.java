package com.estrella.prueba.java8.proyecto.api.consumoBD.item.controller;

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
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.request.ItemRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.response.ItemResponse;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.service.ItemService;

@RestController
@RequestMapping("/estrella/apiBD/item")
public class ItemController {

	@Autowired
	private ItemService service;

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertar")
	public ResponseEntity insertarItem(@RequestBody ItemRequest request) {
		try {
			service.insertarItem(request);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/listar")
	public ResponseEntity<List<ItemResponse>> listarItem() {
		List<ItemResponse> response = new ArrayList<>();
		try {
			response = service.listarItem();
			return new ResponseEntity<List<ItemResponse>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<ItemResponse>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
