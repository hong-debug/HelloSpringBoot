package com.how2java.springboot.mapper.service;

import com.how2java.springboot.pojo.Category;
import com.how2java.springboot.utils.Page4Navigator;

import java.awt.print.Pageable;

public interface CategoryService {
    public Page4Navigator<Category> list(Pageable pageable);

    public void save(Category category);

    public void delete(int id);

    public Category get(int id);
}
