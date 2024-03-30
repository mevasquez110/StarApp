package com.estrella.prueba.java8.proyecto.api.consumoBD.review.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.request.ReviewRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.response.ReviewResponse;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.service.ReviewService;

@RestController
@RequestMapping("/estrella/apiBD/review")
public class ReviewController {

	@Autowired
	private ReviewService service;

	@SuppressWarnings("rawtypes")
	@PostMapping("/insertar")
	public ResponseEntity insertarReview(@RequestBody ReviewRequest request) {
		try {
			service.insertarReview(request);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/listar")
	public ResponseEntity<List<ReviewResponse>> listarReview() {
		List<ReviewResponse> response = new ArrayList<>();
		try {
			response = service.listarReview();
			return new ResponseEntity<List<ReviewResponse>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<ReviewResponse>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/listarPorItem/{id}")
	public ResponseEntity<List<ReviewResponse>> listarReviewForItem(@PathVariable("id") Integer idItem) {
		List<ReviewResponse> response = new ArrayList<>();
		try {
			response = service.listarReviewForItem(idItem);
			return new ResponseEntity<List<ReviewResponse>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<ReviewResponse>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/listarPorUser/{id}")
	public ResponseEntity<List<ReviewResponse>> listarReviewForUser(@PathVariable("id") Integer idUser) {
		List<ReviewResponse> response = new ArrayList<>();
		try {
			response = service.listarReviewForUser(idUser);
			return new ResponseEntity<List<ReviewResponse>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<ReviewResponse>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping(value = "/eliminar/{id}")
	public ResponseEntity eliminarReview(@PathVariable("id") Integer id) {
		try {
			service.eliminarReview(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
