package com.tyss.sample.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.sample.dto.Customers;
import com.tyss.sample.dto.ResponseBean;
import com.tyss.sample.service.ShoppingServiceInf;

@RestController
@RequestMapping("/sdjpa")
public class MainController {
	@Autowired
	ShoppingServiceInf service;
	
	@GetMapping("/fetchAll")
	public ResponseBean getAllUser(){
		List<Customers> customer=service.getAllUser();
		
		return new ResponseBean(customer, true,"Customer List");
		
	}
	@GetMapping("/fetchById")
	public  ResponseBean getById(int cid){
		Optional<Customers> customer=service.getById(cid);
		return new ResponseBean(customer, true,"Customer List");
		
	}
	@PutMapping("/update")
	public  ResponseBean update(Customers customer) {
		Customers customer1=service.update(customer);
		return new ResponseBean(customer1, true,"Customer details updated successfully");
		
	}
	@PostMapping("/add")
	public ResponseBean addCustomers(Customers customer) {
		Customers customer1= service.addCustomers(customer);
		return new ResponseBean(customer1, true,"Added the customer successfully");
		
	}
	@DeleteMapping("/delete")
	public ResponseBean deleteCustomer(Customers customer) {
		service.deleteCustomer(customer);
		return new ResponseBean(customer, true,"Deleted the customer successfully");
		
	}

}
