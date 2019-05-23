package mani.spring.springannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("mani.spring.springannotations")
@PropertySource("classpath:sport.properties")
public class SportConfig 
{
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	
	//define bean for swim coach and inject dependency
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService()); // one above is same
	}
	
}
