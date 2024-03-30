package com.estrella.prueba.java8.proyecto.api.consumoBD.item.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.entity.ItemEntity;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.repository.ItemRepository;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.request.ItemRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.response.ItemResponse;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepository;

	public void insertarItem(ItemRequest request) throws Exception {
		ItemEntity entity = new ItemEntity();
		entity.setIdItem(request.getIdItem());
		entity.setTitle(request.getTitle());
		itemRepository.save(entity);
	}

	public List<ItemResponse> listarItem() throws Exception {
		List<ItemEntity> entityList = itemRepository.findAll();
		List<ItemResponse> responseList = new ArrayList<>();

		for (ItemEntity entity : entityList) {
			ItemResponse response = new ItemResponse();
			response.setIdItem(entity.getIdItem());
			response.setTitle(entity.getTitle());
			responseList.add(response);
		}

		return responseList;
	}
}
