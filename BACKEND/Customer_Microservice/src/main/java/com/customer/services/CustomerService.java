package com.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entities.Customer;
import com.customer.repo.CustomerRepo;
@Service
public class CustomerService {
@Autowired
private CustomerRepo crepo;
	


	public Customer addCustomerDetails(Customer cus) {
		// TODO Auto-generated method stub
		Customer cust=crepo.save(cus);
		return cust;
	}



	



}
