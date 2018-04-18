package com.wx.service.user.controller;

import com.wx.service.feign.UserService;
import com.wx.service.user.entity.User;
import com.wx.service.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: java类作用描述：请输入你对这个类的描述
 * @Author: 作者：lijianguo
 * @CreateDate: 创建日期：2018/4/14 下午4:08
 * @CreateUser: 创建人：lijianguo
 * @Version: 1.0
 **/
@RestController
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    @RequestMapping(value = "/user/userDetail", method = RequestMethod.GET)
    public List<User> getUserDetail(@RequestParam("userId")Long userId) {
        User o = userMapper.selectByPrimaryKey(userId);
        ArrayList<User> u = new ArrayList<>(1);
        u.add(o);
        return u;
    }

    @Override
    @RequestMapping(value = "/user/userDetailByName", method = RequestMethod.GET)
    public User findByName(@RequestParam("loginName")String loginName) {
        return userMapper.findByName(loginName);
    }
}
