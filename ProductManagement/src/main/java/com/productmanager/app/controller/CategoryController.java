package com.productmanager.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productmanager.app.model.Category;
import com.productmanager.app.serviceImpl.CategoryManagementServiceImpl;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("categoryManagement")
public class CategoryController {
	
	@Autowired
	CategoryManagementServiceImpl categoryManagementService;

	@PostMapping("/createCategory")
	public ResponseEntity<Object> createCategory(@RequestBody Category category) {

		return new ResponseEntity<>(categoryManagementService.saveCategory(category), HttpStatus.OK);
	}
	
	@GetMapping("/getAllCategory")
	public ResponseEntity<Object> getAllCategory() {

		return new ResponseEntity<>(categoryManagementService.getAllCategory(), HttpStatus.OK);
	}

}
