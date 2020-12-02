package cn.coget.test.annotation;

import cn.coget.test.base.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBatisScanTest {

  @Test
  public void selectTest() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("cn/coget/test/annotation/applicationContext.xml");
    for (String beanDefinitionName : context.getBeanDefinitionNames()) {
      System.err.println(beanDefinitionName);
    }
    UserService userService = context.getBean(UserService.class);
    System.err.println(userService.getUserTransactional(1L));
    System.err.println(userService.getUserTransactional(1L));
    System.err.println(userService.getUserTransactional(1L));
  }
}
