package com.productmanager.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmanager.app.model.Category;

@Repository
public interface CategoryRespository extends JpaRepository<Category, Integer> {
	
	Category findById(int CategoryId);

}
