package com.productmanager.app.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanager.app.dao.CategoryRespository;
import com.productmanager.app.dao.ProductRepository;
import com.productmanager.app.model.Category;
import com.productmanager.app.model.Product;
import com.productmanager.app.service.ProductManagementService;

@Service
public class ProductManagementServiceImpl  implements ProductManagementService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRespository categoryRepository;
 
	@Override
	public Product saveProduct(Product product,int[] categoryId) {
		
		List<Category> categoryData=new ArrayList<>();
		
		for(int id:categoryId)
		categoryData.add(categoryRepository.findById(id));
		
		product.setCategory(categoryData);
		
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product prod=productRepository.findById(product.getId());
		prod.setName(product.getName());
		prod.setPrice(product.getPrice());
		prod.setCategory(product.getCategory());
	
		return productRepository.save(prod);
	}
	
	public List<Product> getAllProduct(){
		
		return productRepository.findAll();
		
	}
	
public List<Product> getAllProductByCategory(int categoryId){
	

	
		return productRepository.findByCategory(categoryRepository.findById(categoryId));
		
	}

}
