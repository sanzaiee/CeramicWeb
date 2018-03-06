/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sanjay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sanzaie
 */
@Controller
public class IndexController {
 
    @RequestMapping(value = "/index", method=RequestMethod.GET)
    public String index(){
        return "Index";
    }
     
    @RequestMapping(value = "/Admin", method=RequestMethod.GET)
    public String adminpannel(){
        return "adminpanel";
    }
 @RequestMapping(value = "/Login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
   @RequestMapping(value = "/Logout", method = RequestMethod.GET)
    public String logout(HttpServletResponse res,HttpServletRequest req){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if(auth!=null){
            new SecurityContextLogoutHandler().logout(req, res, auth);
        }
        return "redirect:/Login?Logout";
    }
    
}
