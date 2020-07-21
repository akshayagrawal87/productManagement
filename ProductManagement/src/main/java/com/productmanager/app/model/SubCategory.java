//package com.productmanager.app.model;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import lombok.Data;
//
//@Data
//@Entity
//public class SubCategory {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@Column(name = "SUB_CATEGORY_ID")
//	private int id;
//	
//	@Column(name = "SUB_CATEGORY_NAME", nullable = false)
//	private String name;
//	
//	@Column(name = "CHILD_CATEGORY", nullable = true)
//	private String[] childCategory;
//	
//	@JsonIgnore
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID")
//	private Category category;
//
//}
