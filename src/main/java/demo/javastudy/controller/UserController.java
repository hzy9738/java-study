package demo.javastudy.controller;

import demo.javastudy.pojo.JSONResult;
import demo.javastudy.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(){
        User u = new User();
        u.setName("hzy");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword(null);

        return u;
    }

    @RequestMapping("/getUserJson")
    public JSONResult getUserJson(){
        User u = new User();
        u.setName("hz11y");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("123");
        u.setDesc("de112312313123123123");
        return JSONResult.ok(u);
    }
}
