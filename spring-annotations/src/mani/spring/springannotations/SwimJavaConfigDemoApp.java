package mani.spring.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp 
{
	public static void main(String[] args)
	{
		// read spring config java class
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportConfig.class);
	
		//get bean from spring container
		Coach theCoach= context.getBean("swimCoach",Coach.class);
		
		//call methods
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close container
		context.close();
	}
}
