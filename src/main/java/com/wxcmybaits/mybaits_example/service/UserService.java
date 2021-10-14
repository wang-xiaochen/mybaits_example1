package com.wxcmybaits.mybaits_example.service;

import com.wxcmybaits.mybaits_example.entity.User;
import com.wxcmybaits.mybaits_example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    public UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public List<User> findUserByUserId(int userid){

        return userMapper.findUserByUserId(userid);
    }
}
