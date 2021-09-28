package course_by_alishev.core.music.genres;

import course_by_alishev.core.music.Music;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "This is Jazz";
	}
}
