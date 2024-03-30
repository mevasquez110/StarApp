package com.estrella.prueba.java8.proyecto.api.consumoBD.review.entity;

import com.estrella.prueba.java8.proyecto.api.consumoBD.item.entity.ItemEntity;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.entity.UserEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "review")
public class ReviewEntity {

	@Id
	@Column(name = "id_review")
	private Integer idReview;

	@Column(name = "rating")
	private String rating;

	@ManyToOne
	@JoinColumn(name = "id_item", referencedColumnName = "id_item")
	private ItemEntity item;

	@ManyToOne
	@JoinColumn(name = "id_user", referencedColumnName = "id_user")
	private UserEntity user;
}
