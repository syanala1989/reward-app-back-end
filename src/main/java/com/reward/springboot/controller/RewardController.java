package com.reward.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reward.springboot.model.Customer;
import com.reward.springboot.model.Product;
import com.reward.springboot.model.Transaction;
import com.reward.springboot.repository.CustomerRepository;
import com.reward.springboot.repository.ProductRepository;
import com.reward.springboot.repository.TransactionRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1")
public class RewardController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	//Get All customer list in the system.
	@GetMapping("/customers")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}
	
	//Add a New customer to the system.
	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	//Get all the products in the system.
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	//Add a New Product in to the system.
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	//Get all customers
	@GetMapping("/customerNames")
	public List<Object[]> getCustomerIdAndName()
	{
		return customerRepository.findCustomerIdAndName();
	}
	
	//get all products
	@GetMapping("/productNames")
	public List<Object[]> getProductIdAndName()
	{
		return productRepository.findProductIdAndName();
	}
	
	//create a transaction
	@PostMapping("/transactions")
	public Transaction createTransaction(@RequestBody Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	//get transactions based on customer Id
	@GetMapping("/transactions/{id}")
	public List<Object> getTransactionsByCustomerId(@PathVariable Long id){
		return transactionRepository.getCustomerTransactionsById(id);
	}
	
	//Get all transactions
	@GetMapping("/transactions")
	public List<Object> getAllTransactions(){
		return transactionRepository.getAllTransactions();
	}
	
}
