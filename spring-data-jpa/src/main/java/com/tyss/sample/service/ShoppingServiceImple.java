package com.tyss.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.sample.dao.ShoppingDaoInf;
import com.tyss.sample.dto.Customers;
@Service
public class ShoppingServiceImple implements ShoppingServiceInf {
	@Autowired
	ShoppingDaoInf dao;
	
	public List<Customers> getAllUser() {
		return (List<Customers>) dao.findAll();
	}
	
	public  Optional<Customers> getById(int cid) {
		return dao.findById(cid);
	}

	
	public  Customers update(Customers customer) {
		return dao.save(customer);
	}
	
	public Customers addCustomers(Customers customer) {
		return dao.save(customer);
	}
	
	public void deleteCustomer(Customers customer) {
		 dao.delete(customer);
	}
}
