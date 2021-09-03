package part2_annotation_beans.players;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import part2_annotation_beans.music.Music;

import java.util.List;

@Component("mPl")
public class MusicPlayer implements Player {
	private List<Music> music;
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;


	public MusicPlayer(List<Music> music) {
		this.music = music;
	}

	public void setMusic(List<Music> music) {
		this.music = music;
	}

	private void playMusic() {
		music.forEach(s -> System.out.println(s.getSong()));
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

	@Override
	public void play() {
		System.out.printf("Player: %s\nVolume: %s\n\n%n", name, volume);
		playMusic();
	}
}
