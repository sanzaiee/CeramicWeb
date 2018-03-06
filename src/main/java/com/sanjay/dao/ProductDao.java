/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.dao;

import com.sanjay.model.Product;
import java.util.List;

/**
 *
 * @author sanzaie
 */
public interface ProductDao {
    public void insert (Product pro);
    public List<Product>selectAll();
    public List<Product>selectById(int id);
    public void update(Product pro);
    public void delete(Product pro);
    
    
}
