package com.nobel.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nobel.model.Category;

public class SpringEntry {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("Retrieving object from container...");
		
		Category catgory1 = context.getBean("category",Category.class);
		Category catgory2 = context.getBean("category",Category.class);
		Category catgory3 = context.getBean("category",Category.class);

		Category catgoryTest1 = context.getBean("categoryTest",Category.class);
		Category catgoryTest2 = context.getBean("categoryTest",Category.class);	
	
		System.out.println(catgory1);
		System.out.println(catgory2);
		System.out.println(catgory3);
		System.out.println(catgoryTest1);
		System.out.println(catgoryTest2);

		
	}
	
}
