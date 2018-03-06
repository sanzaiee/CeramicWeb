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
@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "product_id")
    private int pid;
    @Column(name = "product_title")
    
    private String ptitle;
    
    @Column(name = "product_pcategory")
    private String pcategory;
   
    @Column(name = "product_price")
    private int pprice;
   
    @Column(name = "product_description")
     private String pdescription;
     
    @Column(name = "product_keyword")    
    private String pkeyword;

    public Product() {
    }

    public Product(int pid, String ptitle, String pcategory, int pprice, String pdescription, String pkeyword) {
        this.pid = pid;
        this.ptitle = ptitle;
        this.pcategory = pcategory;
        this.pprice = pprice;
        this.pdescription = pdescription;
        this.pkeyword = pkeyword;
    }

    public Product(String ptitle, String pcategory, int pprice, String pdescription, String pkeyword) {
        this.ptitle = ptitle;
        this.pcategory = pcategory;
        this.pprice = pprice;
        this.pdescription = pdescription;
        this.pkeyword = pkeyword;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPcategory() {
        return pcategory;
    }

    public void setPcategory(String pcategory) {
        this.pcategory = pcategory;
    }

    public int getPprice() {
        return pprice;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription;
    }

    public String getPkeyword() {
        return pkeyword;
    }

    public void setPkeyword(String pkeyword) {
        this.pkeyword = pkeyword;
    }

  
  
  }

