package com.estrella.prueba.java8.proyecto.api.consumoBD.item.entity;

import java.util.List;
import com.estrella.prueba.java8.proyecto.api.consumoBD.review.entity.ReviewEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "item")
public class ItemEntity {

	@Id
	@Column(name = "id_item")
	private Integer idItem;

	@Column(name = "title")
	private String title;

	@OneToMany(mappedBy = "item")
	private List<ReviewEntity> reviews;

}
