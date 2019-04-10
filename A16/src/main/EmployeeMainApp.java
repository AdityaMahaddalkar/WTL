package main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeMainApp {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory( new ClassPathResource("ApplicationContext.xml"));
		
		
		// Demonstration of prototype scope ( Use this for the original problem Statement )
		System.out.println("Demonstration of prototype scope");
		
		Employee employee1 = factory.getBean("employee", Employee.class);
		Employee employee2 = factory.getBean("employee", Employee.class);
		
		if(employee1 == employee2) {
			System.out.println("Following are singleton scoped beans");
		}
		else {
			System.out.println("Following are prototype scoped beans");
		}
		
		System.out.println(employee1+"\n"+employee2);
		
		
		// Demonstration of singleton scope ( Additional information )
		
		System.out.println("\n\n\nDemonstration of singleton scope");
		
		Employee employee3 = factory.getBean("employeeSingleton", Employee.class);
		Employee employee4 = factory.getBean("employeeSingleton", Employee.class);
		
		if(employee3 == employee4) {
			System.out.println("Following are singleton scoped beans");
		}
		else {
			System.out.println("Following are prototype scoped beans");
		}
		
		System.out.println(employee3+"\n"+employee4);
	}
}
