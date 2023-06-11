package com.example.cruddemo.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@CrossOrigin("*")
@Entity
@Table(name="signup")
public class Signup {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int userid;
	    @Column(name="firstname")
		private String firstname;
	    @Column(name="lastname")
		private String lastname;
	    @Column(name="gender")
	    private String gender;
	    @Column(name="email")
	    private String email;
	    @Column(name="password")
	    private String password;
	    @Column(name="mobileno")
	    private long mobileno;
	    @Column(name="age")
	    private int age;
	    
	    public int getAge() {
			return age;
		}
	    public void setAge(int age) {
			this.age = age;
		}
		Signup(){}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
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
		public long getMobileno() {
			return mobileno;
		}
		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}
		@Override
		public String toString() {
			return String.format(
					"Signup [userid=%s, firstname=%s, lastname=%s, gender=%s, email=%s, password=%s, mobileno=%s, age=%s]",
					userid, firstname, lastname, gender, email, password, mobileno, age);
		}
		public Signup(int userid, String firstname, String lastname, String gender, String email, String password,
				long mobileno, int age) {
			super();
			this.userid = userid;
			this.firstname = firstname;
			this.lastname = lastname;
			this.gender = gender;
			this.email = email;
			this.password = password;
			this.mobileno = mobileno;
			this.age = age;
		}
		
	}	



