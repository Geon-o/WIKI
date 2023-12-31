package com.WIKI.dev.category.controller;

import com.WIKI.dev.category.entity.Category;
import com.WIKI.dev.category.service.CategoryService;
import com.WIKI.dev.category.service.dto.request.RegisterCategoryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/list")
    public List<Category> queryCategoryList() {
        return categoryService.queryCategoryList();

    }

    @PostMapping("/register")
    public void registerCategory(@RequestBody RegisterCategoryRequest registerCategoryRequest) {
        categoryService.register(registerCategoryRequest);
    }

}
