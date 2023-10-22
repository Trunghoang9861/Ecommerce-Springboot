package com.springboot.library.service.impl;

import com.springboot.library.model.Category;
import com.springboot.library.repository.CategoryRepository;
import com.springboot.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        Category categorySave = new Category(category.getName());
        return categorySave;
    }

    @Override
    public Category getById(Long id) {
        return categoryRepository.getById(id);
    }

    @Override
    public Category update(Category category) {
        Category categoryUpdate = new Category();
        categoryUpdate.setName(category.getName());
        categoryUpdate.set_activated(category.is_activated());
        categoryUpdate.set_deleted(category.is_deleted());
        return categoryRepository.save(categoryUpdate);
    }

    @Override
    public void deleteId(Long id) {
        Category category = categoryRepository.getById(id);
        category.set_deleted(true);
        category.set_activated(false);
        categoryRepository.save(category);
    }

    @Override
    public void enableByID(Long id) {
        Category category = categoryRepository.getById(id);
        category.set_deleted(false);
        category.set_activated(true);
        categoryRepository.save(category);
    }
}
