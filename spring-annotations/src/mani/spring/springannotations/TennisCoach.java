package mani.spring.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
/*	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneService=theFortuneService;
	}*/
	
	//define a default constructor
	public TennisCoach()
	{
		System.out.println(">> Tennis Coach :Inside Default Constructor");
	}
	
	//define a setter method
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService)
	{
		System.out.println(">> Tennis Coach :Inside Setter method");
		fortuneService=theFortuneService;
	}*/
	public String getDailyWorkout() {

		return "Practice your service";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
