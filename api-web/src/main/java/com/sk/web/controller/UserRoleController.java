package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.UserRole;
import com.sk.web.model.UserRoleExample;
import com.sk.web.service.UserRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户角色信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/UserRole")
public class UserRoleController {
    Logger log = LoggerFactory.getLogger(UserRoleController.class);

    @Autowired
    UserRoleService userRoleService;

    @ApiOperation("查询所有用户角色信息")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<UserRole> selectAll( UserRole t){
        return userRoleService.selectAll(t);
    }

    @ApiOperation("分页查询所有用户角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(PageRequest pageQuery,UserRole t){
        return userRoleService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个用户角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserRole",dataTypeClass = UserRole.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<UserRole> selectOne(UserRole t){
        return userRoleService.selectOne(t);
    }

    @ApiOperation("增加用户角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserRole",dataTypeClass = UserRole.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<UserRole> insert(@RequestHeader("token") String token, @RequestBody UserRole t) {
        return userRoleService.insert(t);
    }

    @ApiOperation("删除用户角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserRole",dataTypeClass = UserRole.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<UserRole> delete(@RequestHeader("token") String token, @RequestBody UserRole t){
        return userRoleService.delete(t);
    }

    @ApiOperation("更新用户角色信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "UserRole",dataTypeClass = UserRole.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<UserRole> update(@RequestHeader("token") String token, @RequestBody UserRole t){
        UserRoleExample e = new UserRoleExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return userRoleService.update(t,e);
    }

}
