package com.productmanager.app.service;

import com.productmanager.app.model.Product;

public interface ProductManagementService {
	
	public Product saveProduct(Product product,int[] categoryId);
	
	public Product updateProduct(Product product);

}
