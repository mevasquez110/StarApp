package com.estrella.prueba.java8.proyecto.api.consumoBD.item.service;

import java.util.List;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.request.ItemRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.item.response.ItemResponse;

public interface ItemService {

	public void insertarItem(ItemRequest request) throws Exception;

	public List<ItemResponse> listarItem() throws Exception;

}
