package pers.hatsune.cps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.hatsune.cps.domain.ResponseData;
import pers.hatsune.cps.domain.Users;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResponseData login (@RequestParam("email") String email, @RequestParam("pwd") String pwd) {
        ResponseData rd = new ResponseData();
        rd.setCode(200);
        rd.setStatus(true);
        rd.setMessage("登录成功");
        rd.setData(new Users());
        return rd;
    }
}
