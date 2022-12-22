package com.simplilearn.firstspringdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
      HelloWorld h = (HelloWorld) context.getBean("obj");
      h.print();
    
    Student s1 = (Student) context.getBean("stdobj");
    System.out.println("id: "+ s1.getId());
    System.out.println("name: "+ s1.getName());
    Passport p =s1.getPassport();
    System.out.println("passport no: "+ p.getPassNo());
    
    
    
    }
    
    
    
    
}
