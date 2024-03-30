package com.estrella.prueba.java8.proyecto.api.consumoBD.review.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estrella.prueba.java8.proyecto.api.consumoBD.item.entity.ItemEntity;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.entity.ReviewEntity;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.repository.ReviewRepository;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.request.ReviewRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.response.ReviewResponse;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.service.ReviewService;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.entity.UserEntity;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;

	public void insertarReview(ReviewRequest request) throws Exception {
		ReviewEntity entity = new ReviewEntity();
		entity.setIdReview(request.getIdReview());
		entity.setRating(request.getRating());
		ItemEntity item = new ItemEntity();
		item.setIdItem(request.getIdItem());
		entity.setItem(item);
		UserEntity user = new UserEntity();
		user.setIdUser(request.getIdUser());
		entity.setUser(user);
		reviewRepository.save(entity);
	}

	public void eliminarReview(Integer id) throws Exception {
		reviewRepository.deleteById(id);
	}

	public List<ReviewResponse> listarReview() throws Exception {
		List<ReviewEntity> entityList = reviewRepository.findAll();
		List<ReviewResponse> responseList = new ArrayList<>();

		for (ReviewEntity entity : entityList) {
			ReviewResponse response = new ReviewResponse();
			response.setIdReview(entity.getIdReview());
			response.setRating(entity.getRating());
			response.setItem(entity.getItem().getTitle());
			response.setUser(entity.getUser().getName());
			responseList.add(response);
		}

		return responseList;
	}

	@Override
	public List<ReviewResponse> listarReviewForItem(Integer idItem) throws Exception {
		List<ReviewEntity> entityList = reviewRepository.findAllForItem(idItem);
		List<ReviewResponse> responseList = new ArrayList<>();

		for (ReviewEntity entity : entityList) {
			ReviewResponse response = new ReviewResponse();
			response.setIdReview(entity.getIdReview());
			response.setRating(entity.getRating());
			response.setItem(entity.getItem().getTitle());
			response.setUser(entity.getUser().getName());
			responseList.add(response);
		}
		return responseList;
	}

	@Override
	public List<ReviewResponse> listarReviewForUser(Integer idUser) throws Exception {
		List<ReviewEntity> entityList = reviewRepository.findAllForUser(idUser);
		List<ReviewResponse> responseList = new ArrayList<>();

		for (ReviewEntity entity : entityList) {
			ReviewResponse response = new ReviewResponse();
			response.setIdReview(entity.getIdReview());
			response.setRating(entity.getRating());
			response.setItem(entity.getItem().getTitle());
			response.setUser(entity.getUser().getName());
			responseList.add(response);
		}
		return responseList;
	}
}
