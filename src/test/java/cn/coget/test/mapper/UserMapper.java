package cn.coget.test.mapper;

import cn.coget.test.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;

/**
 */
public interface UserMapper {

  UserDO selectById(@Param("id") Long id);

  UserDO selectById2(@Param("id") Long id);

  int updateById(
    @Param("id") Long id,
    @Param("username") String username
  );
}
