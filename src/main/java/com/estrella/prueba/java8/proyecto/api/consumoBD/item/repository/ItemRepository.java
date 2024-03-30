package com.estrella.prueba.java8.proyecto.api.consumoBD.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.entity.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {

}
