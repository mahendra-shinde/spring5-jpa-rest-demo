package com.mahendra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.cruddemo.models.Customer;
import com.mahendra.cruddemo.services.ICustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	// Sample Request URL http://localhost:5000/customers/1
	@Autowired private ICustomerService service;
	@GetMapping("/{custId}")
	public Customer findById(@PathVariable Integer custId) {
		return service.findById(custId);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Customer customer){
		try {
		service.update(customer);
		return new ResponseEntity<>("Record Updated!",HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>("Could not update record! "+ex.getMessage(),HttpStatus.CONFLICT);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Customer customer){
		try {
			service.save(customer);
			return new ResponseEntity<>("Record Saved!",HttpStatus.OK);
			}catch(Exception ex) {
				return new ResponseEntity<>("Could not save record! "+ex.getMessage(),HttpStatus.CONFLICT);
			}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		try {
		service.delete(id);
		return new ResponseEntity<>("Record Deleted!",HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>("Record Cannot be deleted !",HttpStatus.CONFLICT);
		}
	}
}
