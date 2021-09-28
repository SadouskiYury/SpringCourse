package course_by_alishev.core;

import course_by_alishev.core.music.genres.ClassicMusic;
import course_by_alishev.core.music.genres.JazzMusic;
import course_by_alishev.core.music.genres.RockMusic;
import course_by_alishev.core.players.MusicPlayer;
import course_by_alishev.core.players.Player;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("course_by_alishev.core")
@PropertySource("musicPlayer.properties")
public class SpringConfig {


	@Bean
	public MusicPlayer musicPlayer(RockMusic rockMusic, JazzMusic jazzMusic, ClassicMusic classicMusic){
		return new MusicPlayer(List.of(rockMusic, jazzMusic, classicMusic));
	}

	@Bean
	public Computer computer(@Qualifier("mPl") Player musicPlayer, @Qualifier("vPl") Player videoPlayer){
		return new Computer(musicPlayer,  videoPlayer);
	}

}
