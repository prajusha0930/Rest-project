package com.example.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.ServiceInterface.LoginInterfaceService;
import com.example.cruddemo.model.Signup;
import com.example.cruddemo.repository.SignupRepository;

@Service
public class SignupService implements LoginInterfaceService{

	@Autowired
	SignupRepository sr;

	public List<Signup> getAllDetails() {
		
		return sr.findAll();
	}

	public Signup postDetails(Signup id) {
		
		return sr.save(id);
	}

	@Override
	public void deleteUser(int id) {
		
		sr.deleteById(id);
		
	}
	 @Override
    public String postUser(Signup LoginDTO) {
 
        Signup user = new Signup(
 
        		LoginDTO.getUserid(),
        		LoginDTO.getFirstname(),
        		LoginDTO.getLastname(),
        		LoginDTO.getGender(),
        		LoginDTO.getEmail(),
        		LoginDTO.getPassword(),
        		LoginDTO.getMobileno(),
        		LoginDTO.getAge()
 
         );
        sr.save(user);
 
        return user.getEmail();
    }
    
    public String  login(String email,String pwd) {
    	
       
        Signup user1 = sr.findByEmail(email);
        
       
        
        if (user1 != null) {
        	
            String password = user1.getPassword();
    
            if (password.equals(pwd)) {
            		
                    return "Login Success";
                    
            }
                else {
                	
                    return "Password not match";
                }
            } 
    	return "Email not exist";
    }
}
