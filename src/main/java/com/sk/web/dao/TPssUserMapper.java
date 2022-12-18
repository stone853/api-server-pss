package com.sk.web.dao;

import com.sk.web.model.TPssUser;
import com.sk.web.model.TPssUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPssUserMapper {
    long countByExample(TPssUserExample example);

    int deleteByExample(TPssUserExample example);

    int insert(TPssUser record);

    int insertSelective(TPssUser record);

    List<TPssUser> selectByExample(TPssUserExample example);

    int updateByExampleSelective(@Param("record") TPssUser record, @Param("example") TPssUserExample example);

    int updateByExample(@Param("record") TPssUser record, @Param("example") TPssUserExample example);
}