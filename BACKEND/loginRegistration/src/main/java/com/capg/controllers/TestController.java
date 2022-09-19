package com.capg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.models.Company;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	
	@Autowired
	RestTemplate res;
	@GetMapping("/all")
	public String allAccess() {
		return "Public Content.";
	}
	
	
	@GetMapping("/user/{comName}")
	@PreAuthorize("hasRole('USER') or hasRole('COMPANY') or hasRole('ADMIN')")
	public String userAccess() {
		return "Customer Content.";
	}
		
	@GetMapping("/company")
	@PreAuthorize("hasRole('COMPANY')")  // companies will create update dlt coupons
	public String companyAccess() {
		return "Company Board."; 
	}
	@GetMapping("/admin")
	@PreAuthorize("hasRole('ADMIN')")  //all users details whether its is customer admin or company
	public String adminAccess() {
		return "Admin Board."; 
	}
}