package cn.coget.test.base.mapper;

import cn.coget.test.base.entiry.UserDO;
import org.apache.ibatis.annotations.Param;

/**
 */
public interface UserMapper {

  UserDO selectById(@Param("id") Long id);
}
