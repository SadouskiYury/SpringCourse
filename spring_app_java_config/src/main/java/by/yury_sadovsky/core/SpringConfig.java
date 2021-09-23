package by.yury_sadovsky.core;

import by.yury_sadovsky.core.music.genres.ClassicMusic;
import by.yury_sadovsky.core.music.genres.JazzMusic;
import by.yury_sadovsky.core.music.genres.RockMusic;
import by.yury_sadovsky.core.players.MusicPlayer;
import by.yury_sadovsky.core.players.Player;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("by.yury_sadovsky.core")
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
