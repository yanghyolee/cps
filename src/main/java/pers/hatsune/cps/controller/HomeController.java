package pers.hatsune.cps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pers.hatsune.cps.dao.UsersMapper;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    UsersMapper usersMapper;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "world");
        return "home";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }


    @GetMapping("/register")
    public String register(Model model) {
        return "register";
    }

//    @GetMapping("/{id}")
//    public String findById(Model model, @PathVariable(value = "id") Long id){
//        Users u = usersMapper.findById(id);
//        model.addAttribute("name", u.getUsername());
//        return "home";
//    }
}
