package part1XMLBean.music.types;

import part1XMLBean.music.Music;

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
