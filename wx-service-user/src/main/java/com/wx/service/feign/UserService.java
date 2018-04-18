package com.wx.service.feign;

import com.wx.service.user.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Description: java类作用描述：请输入你对这个类的描述
 * @Author: 作者：lijianguo
 * @CreateDate: 创建日期：2018/4/14 下午4:07
 * @CreateUser: 创建人：lijianguo
 * @Version: 1.0
 **/
@FeignClient("service-user")
public interface UserService {
    /**
     * 获取用户的详细情况
     * @Author LJG
     */
    @RequestMapping(value = "/user/userDetail", method = RequestMethod.GET)
    List<User> getUserDetail(@RequestParam("userId") Long userId);

    /**
     * 获取用户的详细情况
     * @Author LJG
     * @date  2018/04/18
     */
    @RequestMapping(value = "/user/userDetailByName", method = RequestMethod.GET)
    User findByName(@RequestParam("loginName")String loginName);



}
