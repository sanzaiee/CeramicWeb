/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.service;

import com.sanjay.model.Category;
import java.util.List;

/**
 *
 * @author sanzaie
 */
public interface CategoryService {
    public void saveCategory(Category cat);
    public List<Category> getAllCategory();
    public List<Category> getCategoryById(int id);
    public List<Category> updateCategory(Category cat);
    public List<Category> deleteCategory(Category cat);
      

}
