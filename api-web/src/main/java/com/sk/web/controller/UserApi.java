package com.sk.web.controller;

import com.sk.model.ResultEnum;
import com.sk.model.ResultJsonModel;
import com.sk.model.ResultModelImp;
import com.sk.web.config.CrmConfig;
import com.sk.web.constant.RequestCommonPathConstant;
import com.sk.web.model.Membership;
import com.sk.web.service.MembershipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;


@Api(tags = "用户接口")
@RestController
@RequestMapping(RequestCommonPathConstant.REQUEST_PROJECT_PATH+"/user")
public class UserApi {
    @Autowired
    MembershipService membershipService;

    @Autowired
    CrmConfig crmConfig;

    @Autowired
    private HttpServletRequest httpRequest;

    @ApiOperation("登陆")
    @ApiImplicitParams(value = {@ApiImplicitParam(name = "code",dataTypeClass = String.class , value ="",required = true)})
    @GetMapping("/v1/login")
    public ResultModelImp<Membership> login(@RequestParam("code") String code){
        String openId = membershipService.getOpenId(crmConfig.getTokenType(),code);
        if (null == openId || "".equals(openId)) {
            return new ResultJsonModel().setCode(ResultEnum.ERROR.getCode()).setMessage("未获取到openid");
        }
        Membership newMem = new Membership();
        newMem.setOpenId(openId);
        ResultJsonModel<Membership> resultModel= membershipService.selectOne(newMem);
        if(resultModel.getCode() < 0 ){
            return new ResultJsonModel<Membership>().setCode(ResultEnum.ERROR.getCode()).setMessage("通过openid获取用户信息失败");
            //membershipService.insert(newMem.setPassword("666666"));
        }
        if(resultModel.getCode() == 0 || resultModel.getData() == null){
            //return new ResultJsonModel<Membership>().setCode(ResultEnum.ERROR.getCode()).setMessage("通过openid获取用户信息失败");
            membershipService.insert(newMem.setPassword("666666").setUpdatetime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));
        }

        httpRequest.getSession().setAttribute("openid",openId);
        return new ResultJsonModel<Membership>().setCode(ResultEnum.SUCCESS.getCode()).setMessage(membershipService.getToken(resultModel.getData()));
    }

    @GetMapping("/getMessage")
    public String getMessage(){
        return "你已通过验证";
    }
}