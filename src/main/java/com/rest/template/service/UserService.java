package com.rest.template.service;

import org.springframework.stereotype.Service;

import com.rest.template.dao.UserRepository;
import com.rest.template.dto.UserDTO;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserDTO getUserByUsername(String username) throws Exception {
		return userRepository.findById(username).map(v -> UserDTO.UserDTOBuilder.userToUserDTO(v))
				.orElseThrow(Exception::new);
	}

}
