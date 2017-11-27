package pers.hatsune.cps.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pers.hatsune.cps.dao.UsersMapper;
import pers.hatsune.cps.domain.Users;

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

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable(value = "id") Long id){
        Users u = usersMapper.findById(id);
        model.addAttribute("name", u.getUsername());
        return "home";
    }
}
