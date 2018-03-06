/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.serviceimpl;

import com.sanjay.dao.ProductDao;
import com.sanjay.model.Product;
import com.sanjay.service.ProductService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanzaie
 */
@Service
@Transactional

public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductDao productDao;
    
    @Override
    public void saveProduct(Product pro) {
   productDao.insert(pro);
    }

    @Override
    public List<Product> getAllProduct() {
     return productDao.selectAll();
    }

    @Override
    public List<Product> getProductById(int id) {
    return productDao.selectById(id);
    }

    @Override
    public List<Product> updateProduct(Product pro) {
      productDao.update(pro);
        return productDao.selectAll();
    }

    @Override
    public List<Product> deleteProduct(Product pro) {
       productDao.delete(pro);
        return productDao.selectAll();
     }
 }

 
