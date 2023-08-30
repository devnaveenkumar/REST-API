package com.example.demo.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "toystoretable")
public class ApplicationModel {
	@Id
	private int id;
	private String toyname;
	private int price;
	private String agecategory;
	private String description;
	
	@OneToOne(cascade = CascadeType.ALL)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "fk_courseid")
	private UserModel usr;
	
	public ApplicationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplicationModel(int id, String toyname, int price, String agecategory, String description, UserModel usr) {
		super();
		this.id = id;
		this.toyname = toyname;
		this.price = price;
		this.agecategory = agecategory;
		this.description = description;
		this.usr = usr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToyname() {
		return toyname;
	}

	public void setToyname(String toyname) {
		this.toyname = toyname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAgecategory() {
		return agecategory;
	}

	public void setAgecategory(String agecategory) {
		this.agecategory = agecategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserModel getUsr() {
		return usr;
	}

	public void setUsr(UserModel usr) {
		this.usr = usr;
	}
	
	
	
	
}
