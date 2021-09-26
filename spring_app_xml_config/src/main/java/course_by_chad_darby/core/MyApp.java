package course_by_chad_darby.core;

import course_by_chad_darby.core.sports_coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new
			ClassPathXmlApplicationContext("applicationContextUdemy.xml");
		Coach coach = applicationContext.getBean("myCoach", Coach.class);
		Coach cricketCoach = applicationContext.getBean("cricketCoach", Coach.class);
		List<Coach> coaches = List.of(coach, cricketCoach);
		coaches.forEach(c -> {
			System.out.println(c.getDailyWorkout());
			System.out.println(c.getDailyFortune());
		});
		applicationContext.close();
	}
}
