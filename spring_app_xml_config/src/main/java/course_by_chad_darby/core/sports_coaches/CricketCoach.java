package course_by_chad_darby.core.sports_coaches;

import course_by_chad_darby.core.FortuneService;

import static java.lang.String.format;

public class CricketCoach implements Coach {
	private String name;
	private String emailAddress;
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	@Override
	public String getDailyWorkout() {
		return format("%s: Practise fast bowling for 15 minutes per day to be good Cricket player\n My emailAddress: %s", name, emailAddress);
	}

	@Override
	public String getDailyFortune() {
		return name + ": " + fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.printf("%s: inside setter method -> setFortuneService\n", name);
		this.fortuneService = fortuneService;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
