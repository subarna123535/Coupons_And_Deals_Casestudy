package com.company.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.entities.Company;
import com.company.services.CompanyService;

@RestController
@RequestMapping("/cnd")
@CrossOrigin("*")
public class CompanyController {
	

@Autowired
private CompanyService cservice;
	
@PostMapping("/savecoupons")
public ResponseEntity<?> createcoupons(@RequestBody  Company com)
	{
		try {
			
			Company savedcomp = this.cservice.save(com);
			System.out.println(savedcomp);
			return new ResponseEntity<>("Added successfully",HttpStatus.OK);
		}
		catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
@GetMapping("/coupons")
public List<Company> gettotalcoupons() {
	return cservice.findAll();
	}
@DeleteMapping("/deletecoupons/{company_id}")
public ResponseEntity<String> deleteProductsById(@PathVariable("company_id") String company_id){
cservice.deleteById(company_id);
return new ResponseEntity<String>("Deleted successfully",HttpStatus.OK);
}
@PutMapping("/updatecoupons/{company_id}")
public ResponseEntity<?> updateCouponById(@RequestBody Company company,@PathVariable("company_id") String company_id) {
	Optional<Company> op = cservice.findById(company_id);
	if (op.isPresent()) {
		Company com = op.get();
		com.setComName(company.getComName());
		com.setLocation(company.getLocation());
		com.setProduct_category(company.getProduct_category());
		com. setCoupon_code(company.getCoupon_code());
		com.setCoupon_set_name(company.getCoupon_set_name());
		com.setDiscount_amount(company.getDiscount_amount());
		com.setProduct_id(company.getProduct_id());
		com.setProduct_name(company.getProduct_name());
		com.setPrice(company.getPrice());
		cservice.save(com);
		return new ResponseEntity<>(com,HttpStatus.OK);
	} else {
		return new ResponseEntity<>("Record Not found",HttpStatus.OK);
	}

}

@GetMapping("/couponsbyCompany/{comName}")
public List<Company> getCouponByCompanyName(@PathVariable("comName") String comName) {
              return cservice.findByName(comName);
}
@GetMapping("/couponsbyCategory/{product_category}")
public List<Company> getCouponByProductCategory(@PathVariable("product_category") String product_category) {
          return cservice.findByProductCategory(product_category);
}

@GetMapping("/couponsbyId/{company_id}")
public ResponseEntity<Company> getCompanyById(@PathVariable("company_id") String company_id ) {
	Company c =cservice.findById(company_id)
			.orElseThrow();
	return ResponseEntity.ok(c);
}
}










