package com.shivam.portal.exam.service;

import java.util.List;

import com.shivam.portal.exam.dto.ResultCategoryDto;
import com.shivam.portal.exam.entity.exam.Category;

public interface CategoryService {
	
	public ResultCategoryDto addCategory(Category category);
	
	public ResultCategoryDto updateCategory(Category category);
	
	public List<Category> getCategorys();
	
	public ResultCategoryDto getCategoryById(Long id);
	
	public ResultCategoryDto deleteCategoryById(Long id);
	
	
}
