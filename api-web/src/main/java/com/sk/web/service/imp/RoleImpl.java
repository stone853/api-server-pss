package com.sk.web.service.imp;


import com.sk.web.mapper.RoleMapper;
import com.sk.web.model.Role;
import com.sk.web.model.RoleExample;
import com.sk.web.service.RoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RoleImpl extends BaseImpl<Role, RoleExample> implements RoleService{

    @Autowired
    RoleMapper<Role> RoleMapper;

    @Autowired
    public void setMapper(RoleMapper<Role> mapper) {
        this.mapper = mapper;
    }


    
}
