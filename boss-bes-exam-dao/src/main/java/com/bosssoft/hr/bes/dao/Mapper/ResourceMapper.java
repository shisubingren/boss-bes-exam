package com.bosssoft.hr.bes.dao.Mapper;

import com.bosssoft.hr.bes.exam.pojo.pojo.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(Integer resourceid);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer resourceid);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}