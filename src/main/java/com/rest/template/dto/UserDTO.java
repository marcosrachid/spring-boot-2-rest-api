package com.rest.template.dto;

import java.time.LocalDate;

import com.rest.template.entities.User;

public class UserDTO {

	private String username;
	private String password;
	private int userType;
	private String email;
	private String name;
	private String lastName;
	private String tel;
	private LocalDate bornDate;

	public UserDTO() {
		super();
	}

	public UserDTO(String username, String password, int userType, String email, String name, String lastName,
			String tel, LocalDate bornDate) {
		super();
		this.username = username;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.tel = tel;
		this.bornDate = bornDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	public static class UserDTOBuilder {

		public static UserDTO userToUserDTO(User user) {
			return new UserDTO(user.getUsername(), "", user.getUserType(), user.getEmail(), user.getName(),
					user.getLastName(), user.getTel(), user.getBornDate());
		}

	}

}
