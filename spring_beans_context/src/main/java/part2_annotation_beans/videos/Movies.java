package part2_annotation_beans.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static part2_annotation_beans.videos.Movies.Genres.ACTION;
import static part2_annotation_beans.videos.Movies.Genres.HORROR;
import static part2_annotation_beans.videos.Movies.Genres.WAR;

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
