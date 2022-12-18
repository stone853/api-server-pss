package com.sk.web.dao;

import com.sk.web.model.TPssRole;
import com.sk.web.model.TPssRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPssRoleMapper {
    long countByExample(TPssRoleExample example);

    int deleteByExample(TPssRoleExample example);

    int insert(TPssRole record);

    int insertSelective(TPssRole record);

    List<TPssRole> selectByExample(TPssRoleExample example);

    int updateByExampleSelective(@Param("record") TPssRole record, @Param("example") TPssRoleExample example);

    int updateByExample(@Param("record") TPssRole record, @Param("example") TPssRoleExample example);
}