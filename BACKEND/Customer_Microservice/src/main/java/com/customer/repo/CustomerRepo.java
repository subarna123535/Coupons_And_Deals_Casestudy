package com.customer.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.entities.Company;
import com.customer.entities.Customer;
@Repository
public interface CustomerRepo extends MongoRepository<Customer,Integer> {


	       

	


}
