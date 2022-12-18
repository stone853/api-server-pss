package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.RoleMenu;
import com.sk.web.model.RoleMenuExample;
import com.sk.web.service.RoleMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "角色菜单信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/RoleMenu")
public class RoleMenuController {
    Logger log = LoggerFactory.getLogger(RoleMenuController.class);

    @Autowired
    RoleMenuService roleMenuService;

    @ApiOperation("查询所有角色菜单信息")
    @GetMapping("/v1/selectAll")
    public ResultModelImp<RoleMenu> selectAll( RoleMenu t){
        return roleMenuService.selectAll(t);
    }

    @ApiOperation("分页查询所有角色菜单信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(PageRequest pageQuery,RoleMenu t){
        return roleMenuService.findPage(pageQuery,t);
    }

    @ApiOperation("查询单个角色菜单信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RoleMenu",dataTypeClass = RoleMenu.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<RoleMenu> selectOne(RoleMenu t){
        return roleMenuService.selectOne(t);
    }

    @ApiOperation("增加角色菜单信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RoleMenu",dataTypeClass = RoleMenu.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<RoleMenu> insert(@RequestHeader("token") String token, @RequestBody RoleMenu t) {
        return roleMenuService.insert(t);
    }

    @ApiOperation("删除角色菜单信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RoleMenu",dataTypeClass = RoleMenu.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<RoleMenu> delete(@RequestHeader("token") String token, @RequestBody RoleMenu t){
        return roleMenuService.delete(t);
    }

    @ApiOperation("更新角色菜单信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "RoleMenu",dataTypeClass = RoleMenu.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<RoleMenu> update(@RequestHeader("token") String token, @RequestBody RoleMenu t){
        RoleMenuExample e = new RoleMenuExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return roleMenuService.update(t,e);
    }

}
