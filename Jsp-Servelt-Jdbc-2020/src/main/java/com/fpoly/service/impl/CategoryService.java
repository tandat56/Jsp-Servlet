package com.fpoly.service.impl;

import java.util.List;
import javax.inject.Inject;
import com.fpoly.dao.ICategoryDAO;
import com.fpoly.model.CategoryModel;
import com.fpoly.service.ICategoryService;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}
