package com.xinxin.Myspring.mapper;

import com.xinxin.Myspring.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    User queryUser(@Param("username") String username, @Param("password") String password);

    void  addUser(@Param("username") String username,@Param("password") String password);

}
