package com.how2java.springboot.dao;

import com.how2java.springboot.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CategoryDAO extends JpaRepository<Category,Integer> {
    public List<Category> findByName(String name);

    public List<Category> findByNameLikeAndIdGreaterThanOrderByNameAsc(String name, int id);
}
