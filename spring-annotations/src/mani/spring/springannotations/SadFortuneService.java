package mani.spring.springannotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() 
	{
	
		return "Today is a very bad day";
	}

}
