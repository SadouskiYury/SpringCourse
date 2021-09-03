package part2_annotation_beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import part2_annotation_beans.music.genres.ClassicMusic;
import part2_annotation_beans.music.genres.JazzMusic;
import part2_annotation_beans.music.genres.RockMusic;
import part2_annotation_beans.players.MusicPlayer;
import part2_annotation_beans.players.Player;

import java.util.List;

@Configuration
@ComponentScan("part2_annotation_beans")
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
