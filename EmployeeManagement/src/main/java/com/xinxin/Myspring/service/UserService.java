package com.xinxin.Myspring.service;

import com.xinxin.Myspring.pojo.User;

public interface UserService {

    User queryUser(String username, String password);

    void addUser(String username, String password);

}
