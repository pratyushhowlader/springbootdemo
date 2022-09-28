package com.example.springbootdemo;

import com.example.springbootdemo.model.Cat;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MainController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String home(Model model, ModelAttribute modelAttribute){
        model.addAttribute("test","Spring boot");
        Optional<Cat> catOptional = Optional.of(new Cat(10,"Pushi"));
       // catOptional.get();
        return model.toString();
    }
}
