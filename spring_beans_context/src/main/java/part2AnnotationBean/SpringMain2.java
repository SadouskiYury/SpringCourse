package part2AnnotationBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		Computer computer = applicationContext.getBean("computer", Computer.class);
		computer.turnOnPlayer();
		applicationContext.close();
	}
}
