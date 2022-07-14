package com.example.springintro;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringintroApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		ICustomerServices customerServices = 
		context.getBean("service",ICustomerServices.class);
		customerServices.add();
	}

}
