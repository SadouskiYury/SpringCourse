package course_by_alishev.core.videos;

import org.springframework.stereotype.Component;

import java.util.List;

import static course_by_alishev.core.videos.Movies.Genres.ACTION;
import static course_by_alishev.core.videos.Movies.Genres.HORROR;
import static course_by_alishev.core.videos.Movies.Genres.WAR;

@Component
public class Movies implements Video {
	List<Genres> genres = List.of(ACTION, HORROR, WAR);

	@Override
	public void seeVideo() {
		System.out.println("Started Movies");
		for (Genres genre : genres) {
			System.out.println(genre.name);
		}

	}

	enum Genres {
		ACTION("Action"), HORROR("Horror"),
		WAR("War");

		String name;

		Genres(String name) {
			this.name = name;
		}
	}
}
