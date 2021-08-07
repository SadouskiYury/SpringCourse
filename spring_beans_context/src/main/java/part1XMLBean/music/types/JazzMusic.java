package part1XMLBean.music.types;

import part1XMLBean.music.Music;

public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "This is Jazz";
	}
}
