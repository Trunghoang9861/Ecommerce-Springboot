package com.springboot.library.service.impl;

import com.springboot.library.model.Category;
import com.springboot.library.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Category getById(Long id) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public void deleteId(Long id) {

    }

    @Override
    public void enableByID(Long id) {

    }
}
