package com.sk.web.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.sk.exception.BizException;
import com.sk.web.constant.CommonConstant;
import com.sk.web.model.Membership;
import com.sk.web.model.User;

import java.util.Date;

/**
 * @Author jinshi
 * @Date 2021/3/3 13:57
 * @Version 1.0
 */
public class UserHelper {
    public static String getPhone (String token) {
        if (null !=token && !"".equals(token)) {
            return JWT.decode(token).getAudience().get(0);
        }
        return "";

    }

    public static String getOpenId (String token) {
        try {
            if (null != token && !"".equals(token)) {
                return JWT.decode(token).getAudience().get(0);
            }
        } catch (BizException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String getToken(String userId,String pass) {
        return JWT.create().withExpiresAt(new Date(System.currentTimeMillis() + CommonConstant.EXPIRE_TIME))
                .withAudience(String.valueOf(userId))
                .sign(Algorithm.HMAC256(pass));
    }
}
