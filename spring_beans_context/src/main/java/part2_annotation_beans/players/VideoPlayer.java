package part2_annotation_beans.players;

import part2_annotation_beans.videos.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.lang.String.format;

@Component
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
		System.out.println(format("Player: %s\nVolume: %s\n\n", name, volume));
		video.forEach(Video::seeVideo);
	}
}
