package cn.coget.test.t3;

import cn.coget.test.t3.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisSpringTest {

  @Test
  public void selectTest() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/coget/test/t3/applicationContext.xml");
    for (String beanDefinitionName : context.getBeanDefinitionNames()) {
      System.err.println(beanDefinitionName);
    }
    UserMapper userMapper = context.getBean(UserMapper.class);
    System.err.println(userMapper.selectById(1L));
    System.err.println(userMapper.selectById(1L));
    System.err.println(userMapper.selectById(1L));
  }
}
