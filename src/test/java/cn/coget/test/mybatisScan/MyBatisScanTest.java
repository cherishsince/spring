package cn.coget.test.mybatisScan;

import cn.coget.test.base.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisScanTest {

  @Test
  public void selectTest() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/coget/test/mybatisScan/applicationContext.xml");
    for (String beanDefinitionName : context.getBeanDefinitionNames()) {
      System.err.println(beanDefinitionName);
    }
    UserMapper userMapper = context.getBean(UserMapper.class);
    System.err.println(userMapper.selectById(1L));
    System.err.println(userMapper.selectById(1L));
    System.err.println(userMapper.selectById(1L));
  }
}
