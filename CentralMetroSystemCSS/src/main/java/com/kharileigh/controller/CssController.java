/**
 *
 * @author kharileigh
 */

package com.kharileigh.controller;

import com.kharileigh.entity.Station;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CssController {
    
    
    // LANDING PAGE 
    @RequestMapping("/")
    public ModelAndView landingPageController() {
    
        return new ModelAndView("LandingPage");
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
    
    
    // HOMEPAGE
    @RequestMapping("/homepage")
    public ModelAndView homepageController() {
    
        return new ModelAndView("HomePage");
    }
    
     // SWIPES IN PAGE
    @RequestMapping("/swipesInPage")
    public ModelAndView swipesInPageController() {
    
        return new ModelAndView("SwipesInPage");
    }
    
    // LISTS ALL THE STATIONS
    @ModelAttribute("stations")
    public List <Station> getStation() {
        List<Station> list = new ArrayList<Station>();
        list.add(new Station(1, "Bank"));
        list.add(new Station(2, "Lewisham"));
        list.add(new Station(3, "Croydon"));
        list.add(new Station(4, "Harlow"));
        list.add(new Station(5, "Euston"));
        
        return list;
        
    }
}
