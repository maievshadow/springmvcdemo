package com.maiev.demo.service;

import com.maiev.demo.dao.UserDao;
import com.maiev.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Integer userId)
    {
        return userDao.getUserInfo(userId);
    }

    public User getUser2(Integer userId)
    {
        return userDao.getUserInfo2(userId);
    }

    public User getUser3(Integer userId)
    {
        return userDao.getUserInfo3(userId);
    }
}
