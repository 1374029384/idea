package com.blb.controller;

import com.blb.pojo.User;
import com.blb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("hello")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("wodr")
    @ResponseBody
    public String sayHello(){
        System.out.println("成功");
        return "success";
    }
    @GetMapping("/{id}")
    @ResponseBody
    public User queryUsreById(@PathVariable("id") Long i){
            User user =  userService.queryById(i);
            return  user;
    }
    @GetMapping("/del/{ids}")
    @ResponseBody
    public String delUserById(@PathVariable("ids") Long id){
        userService.delById(id);
        return "recssuce";
    }
    @GetMapping("list")
    public String queryAllUser(Model model){
      List<User> userlist =  userService.queryAllUser();
      model.addAttribute("users",userlist);
        return "hhh";
    }
}
