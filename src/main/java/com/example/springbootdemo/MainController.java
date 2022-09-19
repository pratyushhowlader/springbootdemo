package com.example.springbootdemo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model, ModelAttribute modelAttribute){
        model.addAttribute("test","Spring boot");
        return model.toString();
    }
}
