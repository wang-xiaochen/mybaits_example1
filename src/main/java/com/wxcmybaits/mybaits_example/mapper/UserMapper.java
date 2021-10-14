package com.wxcmybaits.mybaits_example.mapper;

import com.wxcmybaits.mybaits_example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> findAllUser();
    public List<User> findUserByUserId(int userid);
}
