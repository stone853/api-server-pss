package com.sk.web.mapper;

import com.sk.web.model.Menu;

import java.util.List;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface MenuMapper<T> extends BaseMapper<Menu> {
    List<Menu> findAll();

    List<Menu> findMenuByUserId(@Param(value = "userId") String userId);
}