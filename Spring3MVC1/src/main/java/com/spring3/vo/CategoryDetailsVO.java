package com.spring3.vo;

public class CategoryDetailsVO {

	public CategoryDetailsVO() {
		// TODO Auto-generated constructor stub
	}

	public String getCategoryDetailNames() {
		return categoryDetailNames;
	}
	public void setCategoryDetailNames(String categoryDetailNames) {
		this.categoryDetailNames = categoryDetailNames;
	}
	public String getCategoryDetailIngredients() {
		return categoryDetailIngredients;
	}
	public void setCategoryDetailIngredients(String categoryDetailIngredients) {
		this.categoryDetailIngredients = categoryDetailIngredients;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	private String categoryDetailIngredients;
	private String categoryDetailNames;
	private String categoryId;
	
	
	
}
