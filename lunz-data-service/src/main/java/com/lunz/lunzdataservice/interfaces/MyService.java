package com.lunz.lunzdataservice.interfaces;

import com.lunz.lunzdataservice.domain.User;

public interface MyService {

    /**
     * @Description: 登录
     */
    public User Login(String loginName,String password);

}
