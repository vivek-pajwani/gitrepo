package com.mysoft.spring.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {

	public static void main(String[] args) {
	
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		Person p = (Person) context.getBean("person");
		p.sayHello();
	}

}
