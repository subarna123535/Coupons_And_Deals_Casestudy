package com.capg.models;

import org.springframework.data.annotation.Id;

public class Coupon {
	@Id
	public int coupon_id;
	public String coupon_code;
	public String coupon_set_name;
	public int discount_amount;
	public int product_id;
	public String product_name;
	public int price;
	
	
	
	public Coupon(int coupon_id, String coupon_code, String coupon_set_name, int discount_amount, int product_id,
			String product_name, int price) {
		super();
		this.coupon_id = coupon_id;
		this.coupon_code = coupon_code;
		this.coupon_set_name = coupon_set_name;
		this.discount_amount = discount_amount;
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}



	public int getCoupon_id() {
		return coupon_id;
	}



	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
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
		return "Coupon [coupon_id=" + coupon_id + ", coupon_code=" + coupon_code + ", coupon_set_name="
				+ coupon_set_name + ", discount_amount=" + discount_amount + ", product_id=" + product_id
				+ ", product_name=" + product_name + ", price=" + price + "]";
	}
	
	
	
}
