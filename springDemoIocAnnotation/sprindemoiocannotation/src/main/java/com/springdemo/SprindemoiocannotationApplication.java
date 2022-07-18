package com.springdemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SprindemoiocannotationApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext service = new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerServices customerDal = service.getBean("service",ICustomerServices.class);
		
		customerDal.add();
	}
}
