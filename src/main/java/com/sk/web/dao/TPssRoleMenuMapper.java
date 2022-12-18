package com.sk.web.dao;

import com.sk.web.model.TPssRoleMenu;
import com.sk.web.model.TPssRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPssRoleMenuMapper {
    long countByExample(TPssRoleMenuExample example);

    int deleteByExample(TPssRoleMenuExample example);

    int insert(TPssRoleMenu record);

    int insertSelective(TPssRoleMenu record);

    List<TPssRoleMenu> selectByExample(TPssRoleMenuExample example);

    int updateByExampleSelective(@Param("record") TPssRoleMenu record, @Param("example") TPssRoleMenuExample example);

    int updateByExample(@Param("record") TPssRoleMenu record, @Param("example") TPssRoleMenuExample example);
}