package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Role;
import com.sk.web.model.RoleExample;
import com.sk.web.service.RoleService;
import com.sk.web.utils.UserHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Api(tags = "角色信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/role")
public class RoleController {
    Logger log = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    RoleService roleService;

    @ApiOperation("查询所有角色信息")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<Role> selectAll( Role t){
        return roleService.selectAll(t);
    }

    @ApiOperation("分页查询所有角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(PageRequest pageQuery,Role t){
        return roleService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Role",dataTypeClass = Role.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<Role> selectOne(Role t){
        return roleService.selectOne(t);
    }

    @ApiOperation("增加角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Role",dataTypeClass = Role.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<Role> insert(@RequestHeader("token") String token, @RequestBody Role t) {
        return roleService.insert(t);
    }

    @ApiOperation("删除角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Role",dataTypeClass = Role.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<Role> delete(@RequestHeader("token") String token, @RequestBody Role t){
        return roleService.delete(t);
    }

    @ApiOperation("更新角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Role",dataTypeClass = Role.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<Role> update(@RequestHeader("token") String token, @RequestBody Role t){
        RoleExample e = new RoleExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return roleService.update(t,e);
    }

}
