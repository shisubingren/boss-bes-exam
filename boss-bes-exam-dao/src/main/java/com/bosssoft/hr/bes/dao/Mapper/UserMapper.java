package com.bosssoft.hr.bes.dao.Mapper;
import com.bosssoft.hr.bes.exam.pojo.pojo.User;

public interface UserMapper {
 /**
  * @Author yzq
  * @Description //TODO
  * @Date 下午 08:15 2019/11/25 0025
  * @MethodName deleteByPrimaryKey
  * @Param [userid]
  * @return int
  **/
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}