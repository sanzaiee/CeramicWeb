/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sanzaie
 */
@Entity
@Table(name = "category_table")
public class Category {
     @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Cate_id")
         private int cate_id;
     
     
    @Column(name = "Category_title")
        private String cate_title;

    public Category() {
    }

    public Category(String cate_title) {
        this.cate_title = cate_title;
    }
    

    public Category(int cate_id, String cate_title) {
        this.cate_id = cate_id;
        this.cate_title = cate_title;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public String getCate_title() {
        return cate_title;
    }

    public void setCate_title(String cate_title) {
        this.cate_title = cate_title;
    }
     
    
}
