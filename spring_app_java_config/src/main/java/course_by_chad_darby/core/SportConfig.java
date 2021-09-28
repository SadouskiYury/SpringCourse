package course_by_chad_darby.core;

import course_by_chad_darby.core.services.FortuneService;
import course_by_chad_darby.core.services.SadFortuneService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("course_by_chad_darby")
@PropertySource("sport.properties")
public class SportConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach(@Qualifier("sadFortuneService") FortuneService fortuneService,
	                       @Value("${swimName}") String name) {
		return new SwimCoach(fortuneService, name);
	}
}
