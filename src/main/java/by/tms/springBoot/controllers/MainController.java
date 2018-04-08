package by.tms.springBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//при старте проекта загружает index.jsp
@Controller
public class MainController {
    @RequestMapping("/")
    public String main(Model model){
        model.addAttribute("message", "");
        return "index";
    }
}
