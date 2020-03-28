package com.riyad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChefMain {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("cook.xml");
      Chef obj = (Chef) context.getBean("helloWorld");
      obj.cooking();
   }
}