package course_by_chad_darby.core;

import course_by_chad_darby.core.services.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	@Value("${tennisName}")
	private String name;
	//	bellow simple type of injection field
//	@Autowired
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley!!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Autowired
	@Qualifier("randomFortuneService")
	public void doSetterFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach: inside setter method 'doSetterFortuneService'");
		this.fortuneService = fortuneService;
	}

	@PostConstruct
	public void initMySportStuff() {
		System.out.println(name + ": init my Stuff");
	}

}
