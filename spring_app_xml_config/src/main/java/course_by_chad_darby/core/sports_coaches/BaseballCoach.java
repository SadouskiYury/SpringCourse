package course_by_chad_darby.core.sports_coaches;

import course_by_chad_darby.core.FortuneService;

public class BaseballCoach implements Coach {
	private String name;
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
