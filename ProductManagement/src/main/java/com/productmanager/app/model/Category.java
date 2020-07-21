package com.productmanager.app.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Category{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CATEGORY_ID")
	private int id;
	
	@Column(name = "CATEGORY_NAME", nullable = false)
	private String name;
	
	
//	@Column(name = "CHILD_CATEGORY", nullable = true)
//	@JsonIgnore
//	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<SubCategory> childCategory;
	
	@Column(name = "CHILD_CATEGORY", nullable = true)
	private String[] childCategory;
	
	@JsonIgnore
	@ManyToMany
	private List<Product> productInventory;
	
}