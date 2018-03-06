/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.serviceimpl;

import com.sanjay.dao.CategoryDao;
import com.sanjay.model.Category;
import com.sanjay.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sanzaie
 */
@Service
@Transactional
public class CategorySeviceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;
    


    @Override
    public void saveCategory(Category cat) {
    categoryDao.insert(cat);  
    }

    @Override
    public List<Category> getAllCategory() {
   return categoryDao.selectAll();
    
    }

    @Override
    public List<Category> getCategoryById(int id) {
 return categoryDao.selectById(id);
       
    }

    @Override
    public List<Category> updateCategory(Category cat) {
     categoryDao.update(cat);
        return categoryDao.selectAll();
     }

    @Override
    public List<Category> deleteCategory(Category cat) {
      categoryDao.delete(cat);
        return categoryDao.selectAll();
     }
    
}
