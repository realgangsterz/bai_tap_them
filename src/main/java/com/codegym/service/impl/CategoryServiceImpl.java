package com.codegym.service.impl;

import com.codegym.model.product.Category;
import com.codegym.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {

    @Autowired


    @Override
    public Iterable<Category> findAll() {
        return ;
    }

    @Override
    public Category findById(Long id) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void remove(Long id) {

    }
}
