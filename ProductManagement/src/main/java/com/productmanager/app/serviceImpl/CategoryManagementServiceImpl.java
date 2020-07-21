package com.productmanager.app.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanager.app.dao.CategoryRespository;
import com.productmanager.app.model.Category;
import com.productmanager.app.service.CategoryManagementService;

@Service
public class CategoryManagementServiceImpl implements CategoryManagementService {
	
	@Autowired
	CategoryRespository categoryRespository;

	public Category saveCategory(Category category) {
	
		return categoryRespository.save(category);
		
	}
	
	public List<Category> getAllCategory(){
		
		return categoryRespository.findAll();
		
	}

}
