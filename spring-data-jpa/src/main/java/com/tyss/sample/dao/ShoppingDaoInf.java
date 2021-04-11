package com.tyss.sample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tyss.sample.dto.Customers;

@Repository
public interface ShoppingDaoInf extends CrudRepository<Customers, Integer> {
	

}
