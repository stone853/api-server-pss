package com.sk.web.controller;

import com.sk.model.ResultListModel;
import com.sk.model.ResultModelImp;
import com.sk.page.PageRequest;
import com.sk.page.PageResult;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Menu;
import com.sk.web.model.MenuExample;
import com.sk.web.service.MenuService;
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

@Api(tags = "菜单")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/menu")
public class MenuController {
    Logger log = LoggerFactory.getLogger(MenuController.class);

    @Autowired
    MenuService MenuService;


    @ApiOperation("查询所有菜单")
    @GetMapping("/v1/findAll")
    public ResultModelImp<Menu> findAll(Menu t){
        return MenuService.findAll();
    }


    @ApiOperation("查询用户对应菜单")
    @GetMapping("/v1/queryMenusById")
    public ResultModelImp<Menu> findAll(String userId){
        return MenuService.queryMenusById(userId);
    }

    @ApiOperation("分页查询所有菜单")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "PageRequest",dataTypeClass = PageRequest.class , value ="")})
    @GetMapping("/v1/selectPage")
    public PageResult selectPage(PageRequest pageQuery,Menu t){
        return MenuService.findPage(pageQuery,t);
    }




    @ApiOperation("查询单个菜单")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Menu",dataTypeClass = Menu.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<Menu> selectOne(Menu t){
        return MenuService.selectOne(t);
    }

    @ApiOperation("增加菜单")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Menu",dataTypeClass = Menu.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<Menu> insert(@RequestHeader("token") String token, @RequestBody Menu t) {
        return MenuService.insert(t);
    }

    @ApiOperation("删除菜单")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Menu",dataTypeClass = Menu.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<Menu> delete(@RequestHeader("token") String token, @RequestBody Menu t){
        return MenuService.delete(t);
    }

    @ApiOperation("更新菜单")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "Menu",dataTypeClass = Menu.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<Menu> update(@RequestHeader("token") String token, @RequestBody Menu t){
        MenuExample e = new MenuExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return MenuService.update(t,e);
    }







}
