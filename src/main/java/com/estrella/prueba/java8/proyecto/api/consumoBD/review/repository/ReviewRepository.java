package com.estrella.prueba.java8.proyecto.api.consumoBD.review.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.entity.ReviewEntity;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewEntity, Integer> {

	@Query("select r from ReviewEntity r where r.item.idItem =?1")
	public List<ReviewEntity> findAllForItem(Integer idItem);

	@Query("select r from ReviewEntity r where r.user.idUser =?1")
	public List<ReviewEntity> findAllForUser(Integer idUser);

}
