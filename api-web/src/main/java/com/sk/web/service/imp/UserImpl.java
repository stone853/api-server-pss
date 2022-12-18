package com.sk.web.service.imp;


import com.sk.web.mapper.UserMapper;
import com.sk.web.model.User;
import com.sk.web.model.UserExample;
import com.sk.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserImpl extends BaseImpl<User, UserExample> implements UserService{

    @Autowired
    UserMapper<User> UserMapper;

    @Autowired
    public void setMapper(UserMapper<User> mapper) {
        this.mapper = mapper;
    }


    
}
