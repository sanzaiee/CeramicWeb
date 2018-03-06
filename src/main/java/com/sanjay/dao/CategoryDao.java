/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.dao;

import com.sanjay.model.Category;
import java.util.List;

/**
 *
 * @author sanzaie
 */
public interface CategoryDao {
    public void insert (Category cat);
    public List<Category>selectAll();
    public List<Category>selectById(int id );
    public void update(Category cat);
    public void delete(Category cat);
    
    
    
}
