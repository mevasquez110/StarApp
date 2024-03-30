package com.estrella.prueba.java8.proyecto.api.consumoBD.review.response;

import lombok.Data;

@Data
public class ReviewResponse {

	private Integer idReview;
	private String rating;
	private String item;
	private String user;
	
}
