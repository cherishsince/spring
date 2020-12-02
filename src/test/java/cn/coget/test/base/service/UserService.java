package cn.coget.test.base.service;


import cn.coget.test.base.entiry.UserDO;
import cn.coget.test.base.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserService {

  @Autowired
  private UserMapper userMapper;

  public UserDO getUserDO(Long id) {
    return userMapper.selectById(id);
  }

  @Transactional
  public UserDO getUserTransactional(Long id) {
    return userMapper.selectById(id);
  }

  public UserService setUserMapper(UserMapper userMapper) {
    this.userMapper = userMapper;
    return this;
  }
}
