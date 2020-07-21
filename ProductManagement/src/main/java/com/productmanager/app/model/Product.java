package com.productmanager.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private int id;
	
	@Column(name = "PRODUCT_NAME",nullable = false)
	private String name;
	
	@Column(name = "PRODUCT_PRICE" ,nullable = false)
	private int price;
	
	@NotNull
	@ManyToMany(targetEntity = Category.class, cascade = CascadeType.ALL)
	private List<Category> category;
	
	
}
