package com.reward.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.reward.springboot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query(value="SELECT c.customer_id, c.customer_name from customer c", nativeQuery=true)
	List<Object[]> findCustomerIdAndName();
}
