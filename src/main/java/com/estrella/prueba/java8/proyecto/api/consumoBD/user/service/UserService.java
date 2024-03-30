package com.estrella.prueba.java8.proyecto.api.consumoBD.user.service;

import java.util.List;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.request.UserRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.response.UserResponse;

public interface UserService {

	public void insertarUser(UserRequest request) throws Exception;

	public List<UserResponse> listarUser() throws Exception;

}
