package com.tyss.sample.service;

import java.util.List;
import java.util.Optional;

import com.tyss.sample.dto.Customers;

public interface ShoppingServiceInf {

	public List<Customers> getAllUser();
	public  Optional<Customers> getById(int cid);
	public  Customers update(Customers customer);
	public Customers addCustomers(Customers customer);
	public void deleteCustomer(Customers customer);
}
