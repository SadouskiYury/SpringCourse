package part2_annotation_beans.music.types;

import part2_annotation_beans.music.Music;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
	@Override
	public String getSong() {
		return "This is Jazz";
	}
}
