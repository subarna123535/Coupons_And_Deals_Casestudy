package com.capg.models;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Company {
@Id
private int company_id;
private String comName;
private String location;
private String product_category;
private Collection<Coupon> coupon;
public Company(int company_id, String comName, String location, String product_category, Collection<Coupon> coupon) {
	super();
	this.company_id = company_id;
	this.comName = comName;
	this.location = location;
	this.product_category = product_category;
	this.coupon = coupon;
}
public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getComName() {
	return comName;
}
public void setComName(String comName) {
	this.comName = comName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getProduct_category() {
	return product_category;
}
public void setProduct_category(String product_category) {
	this.product_category = product_category;
}
public Collection<Coupon> getCoupon() {
	return coupon;
}
public void setCoupon(Collection<Coupon> coupon) {
	this.coupon = coupon;
}
@Override
public String toString() {
	return "Company [company_id=" + company_id + ", comName=" + comName + ", location=" + location
			+ ", product_category=" + product_category + ", coupon=" + coupon + "]";
}



}