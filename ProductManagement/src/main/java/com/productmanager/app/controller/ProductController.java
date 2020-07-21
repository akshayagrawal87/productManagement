package com.productmanager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productmanager.app.model.Product;
import com.productmanager.app.serviceImpl.ProductManagementServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("productManagement")
public class ProductController {

	@Autowired
	ProductManagementServiceImpl productManagementService;

	@PostMapping("/addProduct/{categoryId}")
	public ResponseEntity<Object> addProduct(@RequestBody Product product,@PathVariable int[] categoryId) {

		return new ResponseEntity<>(productManagementService.saveProduct(product,categoryId), HttpStatus.OK);
		
	}
	
	@GetMapping("/getAllProducts")
	public ResponseEntity<Object> getAllProducts() {

		return new ResponseEntity<>(productManagementService.getAllProduct(), HttpStatus.OK);
	}
	
	@GetMapping("/getAllProductsByCategory/{categoryId}")
	public ResponseEntity<Object> getAllProductByCategory(@PathVariable(name="categoryId",required = true)int categoryId) {

		return new ResponseEntity<>(productManagementService.getAllProductByCategory(categoryId), HttpStatus.OK);
	}
	

	@PostMapping("/updateProduct")
	public ResponseEntity<Object> updateProduct(@RequestBody Product product) {

		return new ResponseEntity<>(productManagementService.updateProduct(product), HttpStatus.OK);
		
	}
	
}
