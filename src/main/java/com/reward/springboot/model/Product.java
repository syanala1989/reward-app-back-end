package com.reward.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;

	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_amount")
	private double productAmount;
	
	@Column(name = "product_provider")
	private String productProvider;
	
	@Column(name = "product_expiry")
	private String productExpiry;

	public Product() {

	}

	public Product(long productId, String productName, double productAmount, String productProvider,
			String productExpiry) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productAmount = productAmount;
		this.productProvider = productProvider;
		this.productExpiry = productExpiry;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(double productAmount) {
		this.productAmount = productAmount;
	}

	public String getProductProvider() {
		return productProvider;
	}

	public void setProductProvider(String productProvider) {
		this.productProvider = productProvider;
	}

	public String getProductExpiry() {
		return productExpiry;
	}

	public void setProductExpiry(String productExpiry) {
		this.productExpiry = productExpiry;
	}

}
