package cn.coget.test.service;

import cn.coget.test.dataobject.UserDO;
import cn.coget.test.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * author: sin
 * time: 2020/12/1 9:04 下午
 */
public class UserService {

  private UserMapper userMapper;

  public UserService(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Transactional
  public void updateUser(Long id, String username) {
    userMapper.updateById(id, username);
  }

  @Transactional(rollbackFor = Exception.class)
  public void updateUserIsError(Long id, String username) {
    userMapper.updateById(id, username);
    throw new RuntimeException("手动异常!");
  }
}
