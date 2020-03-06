package com.fpoly.dao;

import java.util.List;
import com.fpoly.model.CategoryModel;

public interface ICategoryDAO {

	List<CategoryModel> findAll();
}
