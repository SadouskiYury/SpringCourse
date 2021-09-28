package course_by_chad_darby.core.services;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
	private List<String> data = List.of("1. Beware of the wolf in sheep's clothing!!!",
		"2. Diligence is the mother of good luck!!!",
		"3. The journey is the reward!!");

	private Random random = new Random();

	@Override
	public String getFortune() {
		int index = random.nextInt(data.size());
		return data.get(index);
	}
}
