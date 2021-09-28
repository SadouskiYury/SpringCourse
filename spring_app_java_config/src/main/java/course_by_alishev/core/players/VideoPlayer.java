package course_by_alishev.core.players;

import course_by_alishev.core.videos.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
