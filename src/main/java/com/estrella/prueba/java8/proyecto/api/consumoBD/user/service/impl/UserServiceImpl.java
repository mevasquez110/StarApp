package com.estrella.prueba.java8.proyecto.api.consumoBD.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.entity.UserEntity;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.repository.UserRepository;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.request.UserRequest;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.response.UserResponse;
import com.estrella.prueba.java8.proyecto.api.consumoBD.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public void insertarUser(UserRequest request) throws Exception {
		UserEntity entity = new UserEntity();
		entity.setIdUser(request.getIdUser());
		entity.setName(request.getName());
		userRepository.save(entity);
	}

	public List<UserResponse> listarUser() throws Exception {
		List<UserEntity> entityList = userRepository.findAll();
		List<UserResponse> responseList = new ArrayList<>();

		for (UserEntity entity : entityList) {
			UserResponse response = new UserResponse();
			response.setIdUser(entity.getIdUser());
			response.setName(entity.getName());
			responseList.add(response);
		}

		return responseList;
	}
}
