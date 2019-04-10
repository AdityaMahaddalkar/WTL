package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CricketCoach cCoach = context.getBean("cricketCoach", CricketCoach.class);
		BaseballCoach bCoach = context.getBean("baseballCoach", BaseballCoach.class);
		
		System.out.println(cCoach.getDailyWorkout());
		System.out.println(cCoach.getDailyFortune());
		
		System.out.println(bCoach.getDailyWorkout());
		System.out.println(bCoach.getDailyFortune());
	}
}
