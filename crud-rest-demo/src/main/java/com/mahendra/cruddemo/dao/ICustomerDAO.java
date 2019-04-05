package com.mahendra.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahendra.cruddemo.models.Customer;

@Repository
public interface ICustomerDAO extends JpaRepository<Customer, Integer>{
	
}
