package com.bw.service;

import com.bw.mapper.UserMapper;
import com.bw.pojo.Mysql;
import com.bw.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User login(User user) {
        user = userMapper.login(user);
        return user;
    }

    public void updateDate(User user) {
        userMapper.updateDate(user);
    }

    public List<Mysql> getMysqlList() {
        return userMapper.getMysqlList();
    }

}
