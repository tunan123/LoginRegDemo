package com.ceit.controller;

import com.ceit.service.UserService;
import org.apache.poi.hssf.record.StyleRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    //指定login()方法仅处理POST方式发来的请求
    public String login(String username, String password, HttpSession session)
    {
        return "login";
    }
    @RequestMapping(value = "/checklogin",method = RequestMethod.POST)
    //指定login()方法仅处理POST方式发来的请求
    public String checklogin(String username, String password, HttpSession session)
    {
        Map map=userService.login(username,password,session);
        if(map.containsKey("key"))
        {
            return "login_success";
        }else {
            return "login_fail";
        }

    }

    @RequestMapping(value = "/login_success",method = RequestMethod.GET)
    public String login_success()
    {
        return  "login";
    }

    @RequestMapping(value = "/zhuce",method = RequestMethod.GET)
    public String zhuce()
    {
        return  "reg";
    }


    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public String reg(String username,String password,String password1)
    {
        Map map= userService.reg(username, password);
        if(password.equals(password1)) {
           if (map.containsKey("key")) {
               return "reg_success";
           }else {
               return "reg_fail";
           }
        }else{
            return "reg_fail";
        }

    }
    @RequestMapping(value = "/denglu",method = RequestMethod.GET)
    public String denglu()
    {
        return "reg";
    }


}
