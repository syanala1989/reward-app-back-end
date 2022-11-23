package com.reward.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.reward.springboot.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	@Query(value = "SELECT p.product_name,t.transaction_card,t.transaction_date,p.product_amount "
			+ "FROM transaction t LEFT JOIN product p ON (t.product_id = p.product_id) "
			+ "LEFT JOIN customer c ON (t.customer_id = c.customer_id) WHERE c.customer_id = ?1", nativeQuery = true)
	List<Object> getCustomerTransactionsById(long customerId);

	@Query(value = "SELECT c.customer_name,p.product_name,t.transaction_card,t.transaction_date,p.product_amount "
			+ "FROM transaction t LEFT JOIN product p ON (t.product_id = p.product_id) "
			+ "LEFT JOIN customer c ON (t.customer_id = c.customer_id)", nativeQuery = true)
	List<Object> getAllTransactions();
}
