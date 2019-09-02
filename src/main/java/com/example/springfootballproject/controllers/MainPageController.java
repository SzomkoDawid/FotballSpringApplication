package com.example.springfootballproject.controllers;
import com.example.springfootballproject.WebSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class MainPageController {

    private WebSecurityConfig webSecurityConfig;

    @Autowired
    public MainPageController(WebSecurityConfig webSecurityConfig) {
        this.webSecurityConfig = webSecurityConfig;
    }

    @GetMapping({"/", "index"})
    public String mainView(Model model) throws Exception {
        model.addAttribute("user", webSecurityConfig.userDetailsService().loadUserByUsername("dawid").getUsername());
        return "index";
    }
}
