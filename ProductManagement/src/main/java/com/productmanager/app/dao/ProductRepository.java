package com.productmanager.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productmanager.app.model.Category;
import com.productmanager.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findById(int ProductId);
	
	List<Product> findByCategory(Category category);

}
