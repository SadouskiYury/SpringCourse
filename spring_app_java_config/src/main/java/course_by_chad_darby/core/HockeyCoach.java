package course_by_chad_darby.core;

import course_by_chad_darby.core.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class HockeyCoach implements Coach {
	@Value("${hockeyName}")
	private String name;

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "HockeyCoach: practise twice per day!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@PreDestroy
	public void destroyMySportStuff() {
		System.out.println(name + ": destroy my Stuff");
	}
}
