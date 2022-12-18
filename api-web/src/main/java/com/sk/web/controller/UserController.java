package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.User;
import com.sk.web.model.UserExample;
import com.sk.web.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/User")
public class UserController {
    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;

    @ApiOperation("查询所有用户信息")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<User> selectAll( User t){
        return userService.selectAll(t);
    }

    @ApiOperation("分页查询所有用户信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(PageRequest pageQuery,User t){
        return userService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个用户信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "User",dataTypeClass = User.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<User> selectOne(User t){
        return userService.selectOne(t);
    }

    @ApiOperation("增加用户信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "User",dataTypeClass = User.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<User> insert(@RequestHeader("token") String token, @RequestBody User t) {
        return userService.insert(t);
    }

    @ApiOperation("删除用户信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "User",dataTypeClass = User.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<User> delete(@RequestHeader("token") String token, @RequestBody User t){
        return userService.delete(t);
    }

    @ApiOperation("更新用户信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "User",dataTypeClass = User.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<User> update(@RequestHeader("token") String token, @RequestBody User t){
        UserExample e = new UserExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return userService.update(t,e);
    }

}
