package com.ceit.service;

import com.ceit.dao.UserMapper;
import com.ceit.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public Map reg(String username,String password)
    {
        Map map=new HashMap();
        if(userMapper.judge_name(username)==0) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            userMapper.reg(user);
            map.put("key","success");
            return map;
        }else {
            map.put("nokey","fail");
            return map;
        }

    }
    public Map login(String username, String password, HttpSession session)
    {
        Map map=new HashMap();
        if(userMapper.judge_name(username)==0)
        {
            map.put("nokey","fail");
            return map;
        }
        if(userMapper.judge_password(username).equals(password))
        {
            map.put("key","success");
            return map;
        }else {
            map.put("errotkey","fail");
            return  map;
        }

    }


}
