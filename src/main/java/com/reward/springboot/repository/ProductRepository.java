package com.reward.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.reward.springboot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(value="SELECT p.product_id, p.product_name from product p", nativeQuery=true)
	List<Object[]> findProductIdAndName();
}

