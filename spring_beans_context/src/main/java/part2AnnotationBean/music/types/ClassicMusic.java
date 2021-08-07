package part2AnnotationBean.music.types;

import part2AnnotationBean.music.Music;
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
