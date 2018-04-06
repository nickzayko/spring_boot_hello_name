package by.tms.springBoot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main(Model model){
//        model.addAttribute("message", "");
        return "index";
    }
}
