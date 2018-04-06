package by.tms.springBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HandlerController {

    @RequestMapping(value = "/sendName", method = RequestMethod.GET)
    public String handler(@RequestParam(name = "name") String name, Model model ){
        String result;
        if (name.trim() == null){
            result = "error, empty name!";
        } else {
            result = "Hello, " + name + " !";
        }
        model.addAttribute("message", result);
        return "index";
    }
}
