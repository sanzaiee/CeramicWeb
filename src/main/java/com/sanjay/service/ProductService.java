/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.service;

import com.sanjay.model.Product;
import java.util.List;

/**
 *
 * @author sanzaie
 */
public interface ProductService {
  public void saveProduct(Product pro);
    public List<Product> getAllProduct();
    public List<Product> getProductById(int id);

   public List<Product> updateProduct(Product pro);
    public List<Product> deleteProduct(Product pro);
 
    
      
}
