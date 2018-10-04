package com.rest.template.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.rest.template.dto.UserDTO;
import com.rest.template.service.UserService;

@ApiController("/user")
public class UserController {
	
	private UserService userService;
	
	public UserController(final UserService userService) {
		this.userService = userService;
	}
	
	public ResponseEntity<UserDTO> login(@PathVariable String username) throws Exception {
		return ResponseEntity.ok(userService.getUserByUsername(username));
	}

}
