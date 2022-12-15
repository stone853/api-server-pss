package com.sk.web.controller;

import com.sk.model.ResultModelImp;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Repository;
import com.sk.web.model.RepositoryExample;
import com.sk.web.service.RepositoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "库存信息")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/repository")
public class RepositoryController {
    @Autowired
    RepositoryService repositoryService;

    @ApiOperation("查询所有库存信息")
    @ApiImplicitParam
    @GetMapping("/v1/selectAll")
    public ResultModelImp<Repository> selectAll(@RequestHeader("token") String token, Repository t){
        return repositoryService.selectAll(t);
    }

    @ApiOperation("查询单个库存")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @GetMapping("/v1/selectOne")
    public ResultModelImp<Repository> selectOne(@RequestHeader("token") String token, Repository t){
        return repositoryService.selectOne(t);
    }

    @ApiOperation("增加库存")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/insert")
    public ResultModelImp<Repository> insert(@RequestHeader("token") String token, @RequestBody Repository t){
        return repositoryService.insert(t);
    }

    @ApiOperation("删除库存")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/delete")
    public ResultModelImp<Repository> delete(@RequestHeader("token") String token, @RequestBody Repository t){
        return repositoryService.delete(t);
    }

    @ApiOperation("更新库存信息")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "repository",dataTypeClass = Repository.class , value ="")})
    @PostMapping("/v1/update")
    public ResultModelImp<Repository> update(@RequestHeader("token") String token, @RequestBody Repository t){
        RepositoryExample e = new RepositoryExample();
        e.createCriteria().andIdEqualTo(t.getId());
        return repositoryService.update(t,e);
    }

}
