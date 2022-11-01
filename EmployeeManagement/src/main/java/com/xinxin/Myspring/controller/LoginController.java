package com.xinxin.Myspring.controller;

import com.xinxin.Myspring.pojo.User;
import com.xinxin.Myspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    //管理员登录
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        User user = userService.queryUser(username, password);
        if (user != null) {
            return "main";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

    //管理员注册
    @RequestMapping("/register")
    public String register(@RequestParam("username") String username, @RequestParam("password") String password,
                           @RequestParam("cpassword") String cpassword) {
        if (password.equals(cpassword)) {
            userService.addUser(username, password);
            return "index";
        } else {
            return "index";
        }
    }

}
