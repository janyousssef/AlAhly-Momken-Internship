package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Test {  
public static void main(String[] args) {  

    ApplicationContext context =   
    	    new ClassPathXmlApplicationContext("applicationContext.xml");  
    Student student1=(Student)context.getBean("student");  
    System.out.println(student1.displayInfo());
   

    ((ClassPathXmlApplicationContext) context).close();
}  
}  

