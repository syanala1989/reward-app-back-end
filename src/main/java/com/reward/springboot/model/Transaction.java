package com.reward.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long transactionId;

	@Column(name = "customer_id")
	private long customerId;

	@Column(name = "product_id")
	private long productId;

	@Column(name = "transaction_date")
	private String transactionDate;

	@Column(name = "transaction_card")
	private String transactionCard;

	public Transaction() {

	}

	public Transaction(long transactionId, long customerId, long productId, String transactionDate,
			String transactionCard) {
		super();
		this.transactionId = transactionId;
		this.customerId = customerId;
		this.productId = productId;
		this.transactionDate = transactionDate;
		this.transactionCard = transactionCard;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionCard() {
		return transactionCard;
	}

	public void setTransactionCard(String transactionCard) {
		this.transactionCard = transactionCard;
	}

}
