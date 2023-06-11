package com.example.cruddemo.ServiceInterface;


import com.example.cruddemo.model.Signup;

public interface LoginInterfaceService {
	String postUser(Signup LoginDTO);
	void deleteUser(int id);
}
