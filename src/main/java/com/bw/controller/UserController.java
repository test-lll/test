package com.bw.controller;

import com.bw.pojo.Mysql;
import com.bw.pojo.User;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/toLogin")
    public String getFr(Model model){
        return "login";
    }


    @RequestMapping("login")
    @ResponseBody
    public User login(User user){
        user = userService.login(user);
        user.setDate(new Date());
        if(user!=null){
            userService.updateDate(user);
            return user;
        }
        return null;
    }

    @RequestMapping("list")
    public String toList(){
        return "list";
    }

    @RequestMapping("selectMysql")
    @ResponseBody
    public List<Mysql> getMysqlList(){
        List<Mysql> list = userService.getMysqlList();
        return list;
    }

}
