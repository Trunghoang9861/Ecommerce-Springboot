package com.springboot.library.service;

import com.springboot.library.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category save(Category category);
    Category getById(Long id);
    Category update(Category category);
    void deleteId(Long id);
    void enableByID(Long id);
}
