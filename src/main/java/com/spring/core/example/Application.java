package com.spring.core.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);
		emp.setId(2);
		emp.setName("drama");
		emp.setApplicationContext(context);
		context.close();
		

	}
}
