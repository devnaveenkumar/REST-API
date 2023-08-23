package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "toyStoreTable")
public class ApplicationModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String ToyName;
	private int Price;
	private String AgeCategory;
	private String Description;
	public ApplicationModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplicationModel(int id, String toyName, int price, String ageCategory, String description) {
		super();
		Id = id;
		ToyName = toyName;
		Price = price;
		AgeCategory = ageCategory;
		Description = description;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getToyName() {
		return ToyName;
	}
	public void setToyName(String toyName) {
		ToyName = toyName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getAgeCategory() {
		return AgeCategory;
	}
	public void setAgeCategory(String ageCategory) {
		AgeCategory = ageCategory;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}
