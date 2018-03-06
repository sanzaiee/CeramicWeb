/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.controller;

import com.sanjay.model.Product;
import com.sanjay.service.CategoryService;
import com.sanjay.service.ProductService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
public class ProductController {
    
    @Autowired
    ProductService productService;
    
    @Autowired
    CategoryService categoryService;
    
 @RequestMapping(value = "/Admin/Product/Add", method = RequestMethod.GET)
public String insertnewproduct(Model model){
    model.addAttribute("categorydata",categoryService.getAllCategory() );
    return "insertnewproduct";
}



    @RequestMapping(value = "/Admin/Product/Add", method = RequestMethod.POST)
    public String saveProduct(
            @RequestParam("ptitle") String ptitle,
            @RequestParam("pcategory") String pcategory,
            @RequestParam("pprice") int pprice,
            @RequestParam("pdescription") String pdescription,
            @RequestParam("pkeyword") String pkeyword
    ){
        Product pro = new Product(ptitle, pcategory, pprice, pdescription, pkeyword);
        //hand over this object to service
       productService.saveProduct(pro);
        
        return "insertnewproduct";
    }
    


@RequestMapping(value = "/Admin/Product/View", method = RequestMethod.GET)
public String viewproduct(Model model){
   model.addAttribute("productdata", productService.getAllProduct());
        
    return "viewproduct";
}



@RequestMapping (value="/Admin/Product/Edit/{id}", method =RequestMethod.GET)
public String pedit(@PathVariable("id") int id,Model model){
   model.addAttribute("productdata",productService.getProductById(id));
      model.addAttribute("categorydata",categoryService.getAllCategory() );

   return "pedit";
}

@RequestMapping(value = "/Admin/Product/Update", method = RequestMethod.POST)
    public String updateProduct(@ModelAttribute("product") Product product,Model model){
           model.addAttribute("productdata",productService.updateProduct(product));
     return "redirect:/Admin/Product/View";
    }
   
    
    
    @RequestMapping(value="/Admin/Product/Delete/{id}", method= RequestMethod.GET)
   public String deleteProduct (@PathVariable("id")int id,Model model){
    Product pro =new Product();
    pro.setPid(id);
//      model.addAttribute("employeedata",customerService.deleteCustomer(emp));// if there is return method in service
//        
    productService.deleteProduct(pro);
    
             return"redirect:/Admin/Product/View";
   }
    

}
