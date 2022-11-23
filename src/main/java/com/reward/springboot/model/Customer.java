package com.reward.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_location")
	private String customerLocation;

	@Column(name = "customer_phone")
	private String customerPhone;

	@Column(name = "customer_zip")
	private String customerZip;

	public Customer() {

	}

	public Customer(long customerId, String customerName, String customerLocation, String customerPhone,
			String customerZip) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.customerPhone = customerPhone;
		this.customerZip = customerZip;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}

}
