package by.yury_sadovsky.core.music.genres;

import by.yury_sadovsky.core.music.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
	private ClassicMusic() {
	}

	@Override
	public String getSong() {
		return "Classic Song";
	}
}
