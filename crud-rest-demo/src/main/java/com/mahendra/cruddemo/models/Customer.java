package com.mahendra.cruddemo.models;

import javax.persistence.*;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="cname",length=20)
	private String name;
	
	@Column(name="cphone",length=10)
	private String phone;
	
	@Column(name="city",length=10)
	private String city;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
