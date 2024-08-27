package com.kgisl.capitalmarketing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/employee")
@Controller
public class CustomerController {
   @RequestMapping("/show")
   public String show(){
    return "home";
   }

   @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(@Validated Customer employee, Model model) {
        System.out.println("User Page Requested");
        System.out.println(employee);
        // model.addAttribute("id", employee.getId());
        model.addAttribute("name",employee.getName());

        // model.addAttribute("age", employee.getAge());
        return "user";
    }
    
}
