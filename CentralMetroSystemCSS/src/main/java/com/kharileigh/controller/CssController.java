/**
 *
 * @author kharileigh
 */

package com.kharileigh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CssController {
    
    
    // LANDING PAGE 
    @RequestMapping("/")
    public ModelAndView landingPageController() {
    
        return new ModelAndView("homepage");
    }
    
    
    // LOGIN PAGE 
    @RequestMapping("/login")
    public ModelAndView loginPageController() {
    
        return new ModelAndView("Login");
    }
    
    
     // CREATE ACCOUNT PAGE 
    @RequestMapping("/newUser")
    public ModelAndView newUserPageController() {
    
        return new ModelAndView("NewUser");
    }
}
