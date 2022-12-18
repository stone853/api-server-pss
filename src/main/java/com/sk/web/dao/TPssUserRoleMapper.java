package com.sk.web.dao;

import com.sk.web.model.TPssUserRole;
import com.sk.web.model.TPssUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPssUserRoleMapper {
    long countByExample(TPssUserRoleExample example);

    int deleteByExample(TPssUserRoleExample example);

    int insert(TPssUserRole record);

    int insertSelective(TPssUserRole record);

    List<TPssUserRole> selectByExample(TPssUserRoleExample example);

    int updateByExampleSelective(@Param("record") TPssUserRole record, @Param("example") TPssUserRoleExample example);

    int updateByExample(@Param("record") TPssUserRole record, @Param("example") TPssUserRoleExample example);
}