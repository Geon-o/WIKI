package com.WIKI.dev.category.service;

import com.WIKI.dev.category.entity.Category;
import com.WIKI.dev.category.service.dto.request.RegisterCategoryRequest;

import java.util.List;


public interface CategoryService {

    List<Category> queryCategoryList();

    void register(RegisterCategoryRequest registerCategoryRequest);
}
