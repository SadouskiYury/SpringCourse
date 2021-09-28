package course_by_chad_darby.core.services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Today is lucky day!!!";
	}
}
