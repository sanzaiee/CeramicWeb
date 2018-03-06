/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.controller;

import com.sanjay.model.Category;
import com.sanjay.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sanzaie
 */
@Controller

public class CategoryController {
   
    @Autowired
    CategoryService categoryService;
    

    @RequestMapping(value ="/Admin/Category/Add", method = RequestMethod.GET)
public String newcategory(){
    return "newcategory";
}

@RequestMapping(value ="/Admin/Category/Add", method = RequestMethod.POST)
    public String saveCategory(
            @RequestParam("cate_title") String Cate_title
    ){
        Category cat = new Category(Cate_title);
        //hand over this object to service
       categoryService.saveCategory(cat);
        
        return "newcategory";
    }
    
    @RequestMapping(value ="/Admin/Category/View", method = RequestMethod.GET)
public String viewCategory(Model model){
   model.addAttribute("categorydata", categoryService.getAllCategory());
        
    return "viewcategory";
}     

@RequestMapping (value="/Admin/Category/Edit/{id}", method =RequestMethod.GET)
public String catedit(@PathVariable("id") int id,Model model){
   model.addAttribute("categorydata",categoryService.getCategoryById(id));
   return "catedit";
}

@RequestMapping(value ="/Admin/Category/Update", method = RequestMethod.POST)
    public String updateCategory(@ModelAttribute("category") Category category,Model model){
          model.addAttribute("categorydata",categoryService.updateCategory(category));
        
             return"redirect:/Admin/Category/View";
    }
   
    
    
    @RequestMapping(value="/Admin/Category/Delete/{id}", method= RequestMethod.GET)
   public String deleteCategory (@PathVariable("id")int id,Model model){
    Category cat =new Category();
    cat.setCate_id(id);
//      model.addAttribute("employeedata",customerService.deleteCustomer(emp));// if there is return method in service
//        
   categoryService.deleteCategory(cat);
    
             return"redirect:/Admin/Category/View";
   }
    


}
