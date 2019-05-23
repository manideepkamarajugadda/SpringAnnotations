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
		SwimCoach theCoach= context.getBean("swimCoach",SwimCoach.class);
		
		//call methods
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//call our new swim coach methods
		
		System.out.println("email: "+ theCoach.getEmail());
		System.out.println("team: "+ theCoach.getTeam());
		//close container
		context.close();
	}
}
