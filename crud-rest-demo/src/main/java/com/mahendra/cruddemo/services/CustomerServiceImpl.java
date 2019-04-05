package com.mahendra.cruddemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahendra.cruddemo.dao.ICustomerDAO;
import com.mahendra.cruddemo.models.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired private ICustomerDAO dao;
	
	@Override
	public void save(Customer customer) {
		dao.save(customer);
	}

	@Override
	public Customer findById(Integer custId) {
		
		Optional<Customer> cust = dao.findById(custId);
		return cust.get();//TODO : Add user-defined exception later
	}

	@Override
	public void update(Customer customer) {
		Optional<Customer> temp = dao.findById(customer.getCustomerId());
		if(temp.isPresent()) {
			dao.save(customer);
		}
		//TODO: Else throw an exception
	}

	@Override
	public void delete(Integer custId) {
		dao.deleteById(custId);
	}

}
