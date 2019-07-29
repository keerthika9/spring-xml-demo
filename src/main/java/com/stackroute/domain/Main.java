package com.stackroute.domain;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
  public static void main(String[] args){
    XmlBeanFactory xmlBeanFactory= new XmlBeanFactory ( new ClassPathResource("beans.xml"));
    Movie movie1= (Movie)xmlBeanFactory.getBean("movie");
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Movie movie=(Movie) context.getBean("movie");
    System.out.println(movie.getActor());
    Movie movie2=(Movie) context.getBean("movie2");
    System.out.println(movie.getActor());


  }
}
