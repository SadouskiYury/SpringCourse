package course_by_chad_darby.core.sports_coaches;

import course_by_chad_darby.core.FortuneService;

public class FootballCoach implements Coach {
	private String name;
	private FortuneService fortuneService;

	public FootballCoach(String name, FortuneService fortuneService) {
		this.name = name;
		this.fortuneService = fortuneService;
	}

	public void initMySportStuff() {
		System.out.println(name + ": init my Stuff");
	}

	public void destroyMySportStuff() {
		System.out.println(name + ": destroy my Stuff");
	}

	@Override
	public String getDailyWorkout() {
		return name + ": Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return name + ": Just do it: " + fortuneService.getFortune();
	}
}
