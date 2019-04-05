package com.mahendra.cruddemo.services;

import com.mahendra.cruddemo.models.Customer;

public interface ICustomerService {
	void save(Customer customer);
	Customer findById(Integer custId);
	void update(Customer customer);
	void delete(Integer custId);
}
