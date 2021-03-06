package cn.coget.test.t3.service;


import cn.coget.test.base.entiry.UserDO;
import cn.coget.test.base.mapper.UserMapper;

public class UserService {

  private UserMapper userMapper;

  public UserDO getUserDO(Long id) {
    return userMapper.selectById(id);
  }

  public UserMapper getUserMapper() {
    return userMapper;
  }

  public UserService setUserMapper(UserMapper userMapper) {
    this.userMapper = userMapper;
    return this;
  }
}
