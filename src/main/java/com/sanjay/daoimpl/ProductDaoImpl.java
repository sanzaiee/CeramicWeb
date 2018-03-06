/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.daoimpl;

import com.sanjay.dao.ProductDao;
import com.sanjay.model.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Projections.id;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanzaie
 */
 @Repository
public class ProductDaoImpl implements ProductDao {
    
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insert(Product pro) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(pro);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Product> selectAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Product> pl = session.createCriteria(Product.class).list();
        session.getTransaction().commit();
        session.close();
        return pl;
    }

    @Override
    public List<Product> selectById(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Product> pl = session.createCriteria(Product.class).add(Restrictions.eq("pid",id)).list();
        session.getTransaction().commit();
        session.close();
        return pl; 
    }

    @Override
    public void update(Product pro) {
       Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(pro);
        session.getTransaction().commit();
        session.close();
     }

    @Override
    public void delete(Product pro) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(pro);
        session.getTransaction().commit();
        session.close();
    }

}


