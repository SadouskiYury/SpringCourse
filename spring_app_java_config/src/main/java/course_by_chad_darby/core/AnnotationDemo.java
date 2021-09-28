package course_by_chad_darby.core;

import org.junit.Assert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SportConfig.class);
		Coach coach = applicationContext.getBean("tennisCoach", Coach.class);
//	for validation scope
		Coach coach1 = applicationContext.getBean("tennisCoach", Coach.class);
		Assert.assertNotEquals(coach.hashCode(), coach1.hashCode());
//		for validation singleton scope by default
		Coach coach2 = applicationContext.getBean("hockeyCoach", Coach.class);
		Coach coach3 = applicationContext.getBean("hockeyCoach", Coach.class);
		Assert.assertEquals(coach2.hashCode(), coach3.hashCode());
		System.out.println(coach2.getDailyFortune());
// swimCoach bean configured by SportConfig class
		Coach coach4 = applicationContext.getBean("swimCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach4.getDailyWorkout());
		System.out.println(coach4.getDailyFortune());
		applicationContext.close();
	}
}
