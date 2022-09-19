package com.customer.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.customer.entities.Customer;
import com.customer.repo.CustomerRepo;
import com.customer.services.CustomerService;

@SpringBootTest
class CustomerMicroserviceApplicationTests {

	@Autowired
	private CustomerService service;

	@MockBean
	private CustomerRepo repo;

	@Test
	@Order(1)        //For executing this method first
	public void saveCustomer() //test case for checking get all companies details 
	{
		//List<Company> f=new ArrayList<Company>();
		Customer c=new Customer(106,"megha","guin","kolkata","subarnaguin6@gmail.com",2345);
		when(repo.save(c)).thenReturn(c);
		assertEquals(c,service.addCustomerDetails(c)); 
		System.out.println("save customers");//Invoke the method from the service class
	}
}

