package mani.spring.springannotations;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Use the butterfly style swim";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	

}
