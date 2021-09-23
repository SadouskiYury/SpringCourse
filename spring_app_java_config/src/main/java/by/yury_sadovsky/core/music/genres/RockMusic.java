package by.yury_sadovsky.core.music.genres;

import by.yury_sadovsky.core.music.Music;
import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
	@Override
	public String getSong() {
		return "Rock Song";
	}
}
