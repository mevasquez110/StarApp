package com.estrella.prueba.java8.proyecto.api.consumoBD.review.service;

import java.util.List;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.request.ReviewRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.response.ReviewResponse;

public interface ReviewService {

	public void insertarReview(ReviewRequest request) throws Exception;

	public void eliminarReview(Integer id) throws Exception;

	public List<ReviewResponse> listarReview() throws Exception;

	public List<ReviewResponse> listarReviewForItem(Integer idItem) throws Exception;

	public List<ReviewResponse> listarReviewForUser(Integer idUser) throws Exception;

}
