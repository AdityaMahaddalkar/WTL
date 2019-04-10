package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student1 = context.getBean("student1", Student.class);
		Student student2 = context.getBean("student2", Student.class);
		
		System.out.println(student1 + "\n" + student2);
	}
}
