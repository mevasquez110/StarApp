package com.estrella.prueba.java8.proyecto.api.consumoBD.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
