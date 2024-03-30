package com.estrella.prueba.java8.proyecto.api.consumoBD.user.entity;

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
@Table(name = "user")
public class UserEntity {

	@Id
	@Column(name = "id_user")
	private Integer idUser;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "user")
	private List<ReviewEntity> reviews;

}
