package com.sk.web.dao;

import com.sk.web.model.TPssMenu;
import com.sk.web.model.TPssMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPssMenuMapper {
    long countByExample(TPssMenuExample example);

    int deleteByExample(TPssMenuExample example);

    int insert(TPssMenu record);

    int insertSelective(TPssMenu record);

    List<TPssMenu> selectByExample(TPssMenuExample example);

    int updateByExampleSelective(@Param("record") TPssMenu record, @Param("example") TPssMenuExample example);

    int updateByExample(@Param("record") TPssMenu record, @Param("example") TPssMenuExample example);
}