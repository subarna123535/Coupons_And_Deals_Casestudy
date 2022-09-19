package com.customer.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Customer {

private int cust_id;
private String firtname;
private String lastname;
private String location;
private String email;
private int coupon;


public Customer() {
	super();
}
public Customer(int cust_id, String firtname, String lastname, String location, String email, int coupon) {
	super();
	this.cust_id = cust_id;
	this.firtname = firtname;
	this.lastname = lastname;
	this.location = location;
	this.email = email;
	this.coupon = coupon;
}
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getFirtname() {
	return firtname;
}
public void setFirtname(String firtname) {
	this.firtname = firtname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getCoupon() {
	return coupon;
}
public void setCoupon(int coupon) {
	this.coupon = coupon;
}

}
