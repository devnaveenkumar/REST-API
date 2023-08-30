package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordertable")
public class Orders {
	@Id
	private int orderid;
	private int orderprice;
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int orderid, int orderprice) {
		super();
		this.orderid = orderid;
		this.orderprice = orderprice;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getOrderprice() {
		return orderprice;
	}
	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}
	
	
}
