package part2_annotation_beans.music.types;

import part2_annotation_beans.music.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
	private ClassicMusic() {
	}

	@Override
	public String getSong() {
		return "Classic Song";
	}
}
