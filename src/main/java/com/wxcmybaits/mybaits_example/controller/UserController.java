package com.wxcmybaits.mybaits_example.controller;

import com.wxcmybaits.mybaits_example.entity.User;
import com.wxcmybaits.mybaits_example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private  UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> findAll(){
        return userService.findAllUser();
    }

    @RequestMapping("/getUserByUserID/{userid}")
    @ResponseBody
    public List<User> findUserByUserId(@PathVariable int userid){

        return userService.findUserByUserId(userid);
    }
}
