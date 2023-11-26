package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ListPage;
import com.example.demo.entity.MyUser;
import com.example.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/page")
    public ListPage<MyUser> getPage(Integer page, Integer rows, HttpServletRequest request) {
        return userService.getPage(null == page ? 1 : page, null == rows ? 10 : rows);
    }

    @PostMapping("/add")
    public String add(String name, String phone) {
        MyUser user = new MyUser();
        user.setName(name);
        user.setPhone(phone);
        if(userService.add(user)){
            return "插入成功!";
        }
        return "插入失败!";
    }

    @PostMapping("/update")
    public String update(String name, String phone) {
        MyUser user = new MyUser();
        user.setName(name);
        user.setPhone(phone);
        if(userService.update(user)){
           return "更新成功!";
        }
        return "更新失败!";
    }

    @PostMapping("/remove")
    public String deleteContact(String name) {
        if(userService.remove(name)){
          return "删除成功!";
        }
        return "删除失败!";
    }

}