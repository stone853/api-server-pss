package com.sk.web.service.imp;


import com.sk.web.mapper.UserRoleMapper;
import com.sk.web.model.UserRole;
import com.sk.web.model.UserRoleExample;
import com.sk.web.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRoleImpl extends BaseImpl<UserRole, UserRoleExample> implements UserRoleService{

    @Autowired
    UserRoleMapper<UserRole> UserRoleMapper;

    @Autowired
    public void setMapper(UserRoleMapper<UserRole> mapper) {
        this.mapper = mapper;
    }


    
}
