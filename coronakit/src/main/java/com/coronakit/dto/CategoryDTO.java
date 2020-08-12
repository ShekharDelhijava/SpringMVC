package com.coronakit.dto;

import java.util.*;



public class CategoryDTO {
	
	private Integer categoryId;
	private String categoryName;
	private List<ItemDTO> Item;
	
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<ItemDTO> getItem() {
		return Item;
	}
	public void setItem(List<ItemDTO> item) {
		Item = item;
	}
	
}
