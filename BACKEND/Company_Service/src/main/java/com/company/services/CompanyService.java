package com.company.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.entities.Company;
import com.company.repo.CompanyRepo;
@Service
public class CompanyService {
@Autowired
private CompanyRepo crepo;


	public Company save(Company com) {
		// TODO Auto-generated method stub
		return crepo.save(com);
	}
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}
	public void deleteById(String company_id) {
		// TODO Auto-generated method stub
		crepo.deleteById(company_id);
	}
	public List<Company> findByName(String comName) {
		// TODO Auto-generated method stub
		return crepo.findByName(comName);
	}
	public List<Company> findByProductCategory(String product_category) {
		// TODO Auto-generated method stub
		return crepo.findByProductCategory(product_category);
	}
	public Optional<Company> findById(String company_id) {
		// TODO Auto-generated method stub
		return crepo.findById(company_id);
	}
	

}
