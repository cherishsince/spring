package cn.coget.test;

import cn.coget.test.mapper.UserMapper;
import cn.coget.test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Assert;

/**
 * author: sin
 * time: 2020/12/1 7:49 下午
 */
public class MainTest {

  @Test
  public void selectTest() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/coget/test/spring-context.xml");
    for (String beanDefinitionName : context.getBeanDefinitionNames()) {
      System.err.println(beanDefinitionName);
    }
    // 执行查询
    UserMapper userMapper = context.getBean(UserMapper.class);
    System.err.println(userMapper.selectById(1L));
    System.err.println(userMapper.selectById(1L));
  }

  @Test
  public void updateTest() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/coget/test/spring-context.xml");
    for (String beanDefinitionName : context.getBeanDefinitionNames()) {
      System.err.println(beanDefinitionName);
    }
    // 更新数据
    Long userId = 1L;
    String updateUsername = "admin2";
    UserService userService = context.getBean(UserService.class);
    userService.updateUser(userId, updateUsername);
    // 执行查询
    UserMapper userMapper = context.getBean(UserMapper.class);
    Assert.isTrue(userMapper.selectById(userId).getUsername().equals(updateUsername), "没有成功更新username!");
  }

  @Test
  public void updateIsErrorTest() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/coget/test/spring-context.xml");
    for (String beanDefinitionName : context.getBeanDefinitionNames()) {
      System.err.println(beanDefinitionName);
    }
    // 更新数据
    Long userId = 1L;
    String updateUsername = "admin22";
    UserService userService = context.getBean(UserService.class);
    userService.updateUserIsError(userId, updateUsername);
  }
}
