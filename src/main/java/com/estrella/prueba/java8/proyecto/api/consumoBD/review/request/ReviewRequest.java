package com.estrella.prueba.java8.proyecto.api.consumoBD.review.request;

import lombok.Data;

@Data
public class ReviewRequest {

	private Integer idReview;
	private String rating;
	private Integer idItem;
	private Integer idUser;
}
