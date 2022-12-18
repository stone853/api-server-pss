package com.sk.web.mapper;

import com.sk.web.model.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper<T> extends BaseMapper<User> {
    
}