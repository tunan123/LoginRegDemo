package com.ceit.dao;

import com.ceit.model.User;

public interface UserMapper {
    public  void    reg(User user);
    public  int     judge_name(String username);
    public  String  judge_password(String username);

}
