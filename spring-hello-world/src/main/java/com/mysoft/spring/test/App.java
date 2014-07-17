package com.mysoft.spring.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mysoft/spring/test/beans/beans.xml");
		Person p = (Person) context.getBean("person");
		p.sayHello();
		System.out.println(p);
		((AbstractApplicationContext) context).close();
	}

}
