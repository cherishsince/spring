package cn.coget.test.t3.mapper;

import cn.coget.test.t3.entiry.UserDO;
import org.apache.ibatis.annotations.Param;

/**
 */
public interface UserMapper {

  UserDO selectById(@Param("id") Long id);
}
