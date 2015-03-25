/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pavlov.springlocale;

import java.util.Calendar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Василий
 */
@Controller
public class HomeController {
    
     @RequestMapping({"/","/seedstartermng"})
    public String showSeedstarters() {
         
        return "index";
    }
    
    
}
