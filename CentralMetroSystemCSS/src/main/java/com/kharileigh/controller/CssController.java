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
    
    
    // LANDING PAGE - Toggle Menu : Login / Create New User
    @RequestMapping("/")
    public ModelAndView landingPageController() {
    
        return new ModelAndView("index");
    }
}
