package course_by_chad_darby.core;

import course_by_chad_darby.core.services.FortuneService;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	private String name;

	public SwimCoach(FortuneService fortuneService, String name) {
		this.fortuneService = fortuneService;
		this.name = name;
	}


	@Override
	public String getDailyWorkout() {
		return name + " Swim 6 hours per every day!!!";
	}

	@Override
	public String getDailyFortune() {
		return name + fortuneService.getFortune();
	}
}
