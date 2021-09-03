package part2_annotation_beans.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import part2_annotation_beans.videos.Video;

import java.util.List;

@Component("vPl")
@Scope("prototype")
public class VideoPlayer implements Player {
	@Value("Video Player")
	private String name;
	@Value("78")
	private int volume;
	private List<Video> video;

	@Autowired
	public VideoPlayer(List<Video> video) {
		this.video = video;
	}

	@Override
	public void play() {
		System.out.printf("Player: %s\nVolume: %s\n\n%n", name, volume);
		video.forEach(Video::seeVideo);
	}
}
