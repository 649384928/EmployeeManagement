package com.xinxin.Myspring.service.impl;

import com.xinxin.Myspring.mapper.UserMapper;
import com.xinxin.Myspring.pojo.User;
import com.xinxin.Myspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUser(String username, String password) {
        return userMapper.queryUser(username,password);
    }

    @Override
    public void addUser(String username, String password) {
        userMapper.addUser(username,password);
    }
}
