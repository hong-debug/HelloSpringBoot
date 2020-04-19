package com.how2java.springboot.mapper.service.impl;

import com.how2java.springboot.mapper.service.CategoryService;
import com.how2java.springboot.pojo.Category;
import com.how2java.springboot.utils.Page4Navigator;

import java.awt.print.Pageable;

public class CategoryServiceImpl implements CategoryService {
    @Override
    public Page4Navigator<Category> list(Pageable pageable) {
        return null;
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Category get(int id) {
        return null;
    }
}
