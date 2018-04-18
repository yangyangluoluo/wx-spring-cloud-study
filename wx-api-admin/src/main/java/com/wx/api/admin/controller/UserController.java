package com.wx.api.admin.controller;



import com.wx.service.feign.UserService;
import com.wx.service.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @Description: java类作用描述：请输入你对这个类的描述
 * @Author: 作者：lijianguo
 * @CreateDate: 创建日期：2018/4/14 下午4:37
 * @CreateUser: 创建人：lijianguo
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user/userDetail", method = RequestMethod.GET)
    public List<User> getUserDetail(Long userId) {

        List<User> u = userService.getUserDetail(userId);

        return u;
    }


}
