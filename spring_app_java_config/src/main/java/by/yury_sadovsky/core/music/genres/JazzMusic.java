package by.yury_sadovsky.core.music.genres;

import by.yury_sadovsky.core.music.Music;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "This is Jazz";
	}
}
