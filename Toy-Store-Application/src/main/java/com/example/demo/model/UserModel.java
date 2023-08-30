package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usertable")
public class UserModel {
	@Id
	private int userid;
	private String username;
	private int age;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private List<Orders> od;
	
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserModel(int userid, String username, int age, List<Orders> od) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.od = od;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Orders> getOd() {
		return od;
	}


	public void setOd(List<Orders> od) {
		this.od = od;
	}

	
	
	
}
