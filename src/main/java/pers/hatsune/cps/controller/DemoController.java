package pers.hatsune.cps.controller;

import org.springframework.web.bind.annotation.*;
import pers.hatsune.cps.domain.Users;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "test", method = RequestMethod.POST)
    List<Users> test () {
        List<Users> data = new ArrayList<Users>();
        Users user = new Users();
        user.setId((long) 1);
        user.setUsername("Bruce");
        data.add(user);

        Users user2 = new Users();
        user2.setId((long) 2);
        user2.setUsername("Batman");
        data.add(user2);

        return data;
    }
}
