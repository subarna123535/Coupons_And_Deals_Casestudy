package com.customer.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.entities.Company;
import com.customer.entities.Customer;
import com.customer.repo.CustomerRepo;
import com.customer.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
@Autowired
RestTemplate res;
@Autowired
private CustomerRepo crepo;
@Autowired
private CustomerService cservice;

@GetMapping("/get")
public String getAllCoupons() {
	HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity <String> entity = new HttpEntity<String>(headers);
	return res.exchange("http://localhost:8008/cnd/getallcoupons",HttpMethod.GET, entity, String.class).getBody();
	
}
/*@GetMapping("find/{comName}")
public String getCouponList(@PathVariable("comName") String comName ,@RequestBody Company company) {
    HttpHeaders httpHeaders = new HttpHeaders();
    httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
    return res.exchange("https://localhost:8008/cnd/getcoupon/"+comName, HttpMethod.GET, entity,String.class).getBody();
}*/
@GetMapping("/find/{comName}")
public	List<Company> getCouponByCompanyName(@PathVariable("comName") String comName)
{
	
	ResponseEntity<List<Company>> companyResponse =  res.exchange("http://localhost:8008/cnd/getcoupon/"+comName,HttpMethod.GET, null, new ParameterizedTypeReference<List<Company>>() {});	
	
	List<Company> company = companyResponse.getBody();
	return  company;
}

@GetMapping("/category/{product_category}")
public	List<Company> getCouponByProductCategory(@PathVariable("product_category") String product_category)
{
	
	ResponseEntity<List<Company>> companyResponse =  res.exchange("http://localhost:8008/cnd/get/"+product_category,HttpMethod.GET, null, new ParameterizedTypeReference<List<Company>>() {});	
	
	List<Company> company = companyResponse.getBody();
	return  company;
}




@PostMapping("/addcustomer")
public ResponseEntity<?> createcustomer(@RequestBody Customer cus)
	{
		try {
			
			Customer savedcomp =cservice.addCustomerDetails(cus);
			System.out.println(savedcomp);
			return new ResponseEntity<>("Added successfully",HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	
	
}