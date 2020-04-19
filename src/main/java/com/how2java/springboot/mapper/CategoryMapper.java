package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Category;
//import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface CategoryMapper {

    //@Select("select * from category_ ")
    List<Category> findAll();

}