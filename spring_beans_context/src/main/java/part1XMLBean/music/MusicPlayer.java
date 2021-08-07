package part1XMLBean.music;

import java.util.List;

public class MusicPlayer {
	private List<Music> music;
	private String name;
	private int volume;

	//IoC
	public MusicPlayer(List<Music> music) {
		this.music = music;
	}

	public MusicPlayer() {
	}

	public void setMusic(List<Music> music) {
		this.music = music;
	}

	public void playMusic() {
		music.forEach(s -> System.out.println(s.getSong()));
		System.out.println("Player: " + name);
		System.out.println("Volume: " + volume);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void doMyInit() {
		System.out.println("Doing Init method prototype scope");
	}

	public void doMyDestroy() {
		System.out.println("Destroy method prototype scope");
	}
}
