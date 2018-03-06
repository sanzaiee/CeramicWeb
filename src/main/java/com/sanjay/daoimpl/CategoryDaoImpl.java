/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.daoimpl;

import com.sanjay.dao.CategoryDao;
import com.sanjay.model.Category;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sanzaie
 */
@Repository
public class CategoryDaoImpl implements CategoryDao{
@Autowired
SessionFactory sessionFactory;

    @Override
    public void insert(Category cat) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(cat);
        session.getTransaction().commit();
        session.close();
    
        
    }

    @Override
    public List<Category> selectAll() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Category> cl = session.createCriteria(Category.class).list();
        session.getTransaction().commit();
        session.close();
        return cl;
    
    }

    @Override
    public List<Category> selectById(int id ) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<Category> cl = session.createCriteria(Category.class).add(Restrictions.eq("cate_id",id)).list();
        session.getTransaction().commit();
        session.close();
        return cl;
    }

    @Override
    public void update(Category cat) {
    
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(cat);
        session.getTransaction().commit();
        session.close();
   
    }

    @Override
    public void delete(Category cat) {
           Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(cat);
        session.getTransaction().commit();
        session.close();
 }
    

}
