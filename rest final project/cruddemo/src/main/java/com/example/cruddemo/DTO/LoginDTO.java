package com.example.cruddemo.DTO;

public class LoginDTO {
       private String email;
       private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return String.format("LoginDTO [email=%s, password=%s]", email, password);
	}
	public LoginDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public LoginDTO() {
		super();
	}
       
}
