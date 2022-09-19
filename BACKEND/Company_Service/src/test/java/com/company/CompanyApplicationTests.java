package com.company;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.company.entities.Company;

import com.company.repo.CompanyRepo;
import com.company.services.CompanyService;
import com.mongodb.connection.Stream;
@SpringBootTest(classes= {CompanyApplicationTests.class})
public class CompanyApplicationTests {

	/*@Mock         //Used for mocking the repository class
	CompanyRepo crepo;

	@InjectMocks  //Used for injecting/invoking the methods of service class
	CompanyService service;

	public List<Company> f;

	@Test
	@Order(1)        //For executing this method first
	public void getCompany() //test case for checking get all companies details 
	{
		List<Company> f=new ArrayList<Company>();
		f.add(new Company(105, "MYNTRA", "PUNE","FASHION",34,"utfy","monsoon",70,50,"saree",900000));
		
		
		when(crepo.findAll()).thenReturn(f);
		assertEquals(1,service.findAll().size());//Invoke the method from the service class
		System.out.println("get all");
	}
	@Test
	@Order(1)        //For executing this method first
	public void saveCompany() //test case for checking get all companies details 
	{
		List<Company> f=new ArrayList<Company>();
		Company c=new Company(106, "FLIPKART", "PUNE","ELECTRONICS",95,"ERJNJKW","PUJOSALES",20,80,"MOBILE",100000);
		
		//myusers.add(new Farmer(110, "Rajashi Paul", "rajashi.das2000@gmail.com","Female", "Patna","raj@2000"));
		//myusers.add(new Farmer(111, "Sumon Paul", "sumon.das2000@gmail.com","Male", "Gujrat","sumon@2000"));
		when(crepo.save(c)).thenReturn(c);
		assertEquals(c,service.save(c)); 
		System.out.println("save");//Invoke the method from the service class
	}*/
	
}
