package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor
{

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
  {
    System.out.println("after Init "+beanName);
    return  bean;
  }
  public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
  {
    System.out.println("before Init "+beanName);
    return bean;
  }

}
