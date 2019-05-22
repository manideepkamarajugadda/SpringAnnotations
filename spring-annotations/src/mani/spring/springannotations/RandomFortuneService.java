package mani.spring.springannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create an array of strings
	private String[] data= {"Beware of the lion",
			"Arya stark is the night king killer",
			"Jon Snow knows nothing",
			"Bran is the 3 eyed raven and king of six kingdoms",
			"Sansa is the queen in the north"};
	private Random myRandom= new Random();
	
	
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}
	

}
