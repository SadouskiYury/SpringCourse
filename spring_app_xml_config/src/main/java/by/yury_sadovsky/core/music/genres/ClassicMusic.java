package by.yury_sadovsky.core.music.genres;

import by.yury_sadovsky.core.music.Music;

public class ClassicMusic implements Music {
	private ClassicMusic() {
	}

	public static ClassicMusic getInstance() {
		return new ClassicMusic();
	}

	public void doMyInit() {
		System.out.println("Doing Init method singleton");
	}

	public void doMyDestroy() {
		System.out.println("Destroy method singleton");
	}

	@Override
	public String getSong() {
		return "Classic Song";
	}
}
