package com.stackroute.domain;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main
{
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    BeanLifeCycle beanLifeCycle= (BeanLifeCycle)context.getBean("BeanLifeCycle");

  }
}
