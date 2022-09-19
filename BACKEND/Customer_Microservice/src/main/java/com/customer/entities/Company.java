package com.customer.entities;

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
private String coupon_code;
private String coupon_set_name;
private int discount_amount;
private int product_id;
private String product_name;
private int price;
public Company(int company_id, String comName, String location, String product_category, String coupon_code,
		String coupon_set_name, int discount_amount, int product_id, String product_name, int price) {
	super();
	this.company_id = company_id;
	this.comName = comName;
	this.location = location;
	this.product_category = product_category;
	this.coupon_code = coupon_code;
	this.coupon_set_name = coupon_set_name;
	this.discount_amount = discount_amount;
	this.product_id = product_id;
	this.product_name = product_name;
	this.price = price;
}
public Company() {
	super();
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
public String getCoupon_code() {
	return coupon_code;
}
public void setCoupon_code(String coupon_code) {
	this.coupon_code = coupon_code;
}
public String getCoupon_set_name() {
	return coupon_set_name;
}
public void setCoupon_set_name(String coupon_set_name) {
	this.coupon_set_name = coupon_set_name;
}
public int getDiscount_amount() {
	return discount_amount;
}
public void setDiscount_amount(int discount_amount) {
	this.discount_amount = discount_amount;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Company [company_id=" + company_id + ", comName=" + comName + ", location=" + location
			+ ", product_category=" + product_category + ", coupon_code=" + coupon_code + ", coupon_set_name="
			+ coupon_set_name + ", discount_amount=" + discount_amount + ", product_id=" + product_id
			+ ", product_name=" + product_name + ", price=" + price + "]";
}


}
