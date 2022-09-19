package com.company.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.company.entities.Company;

@Repository
public interface CompanyRepo extends MongoRepository<Company,String>{
	
	@Query("{comName:?0}")
	 List<Company> findByName(String comName);

	
	@Query("{product_category:?0}")
	List<Company> findByProductCategory(String product_category);


	void deleteById(String company_id);


	Optional<Company> findById(String company_id);



	

	

	

	

	
	

	
	
	

	

}
