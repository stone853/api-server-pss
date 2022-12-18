package com.sk.web.service.imp;


import com.sk.web.mapper.RoleMenuMapper;
import com.sk.web.model.RoleMenu;
import com.sk.web.model.RoleMenuExample;
import com.sk.web.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleMenuImpl extends BaseImpl<RoleMenu, RoleMenuExample> implements RoleMenuService{

    @Autowired
    RoleMenuMapper<RoleMenu> RoleMenuMapper;

    @Autowired
    public void setMapper(RoleMenuMapper<RoleMenu> mapper) {
        this.mapper = mapper;
    }


    
}
