package com.bosssoft.hr.bes.dao.Mapper;


import com.bosssoft.hr.bes.exam.pojo.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}