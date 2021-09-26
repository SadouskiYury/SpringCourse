package course_by_alishev.core;

import course_by_alishev.core.music.Music;
import course_by_alishev.core.music.MusicPlayer;
import course_by_alishev.core.music.genres.JazzMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//  prototype scope
		MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
		MusicPlayer musicPlayer2 = applicationContext.getBean("musicPlayer", MusicPlayer.class);
		System.out.println("Prototype: " + (musicPlayer == musicPlayer2));
		//  singleton scope by default
		Music jazzMusic = applicationContext.getBean("jazzMusic", JazzMusic.class);
		Music jazzMusic2 = applicationContext.getBean("jazzMusic", JazzMusic.class);
		System.out.println("Singleton: " + (jazzMusic2 == jazzMusic));


		musicPlayer.playMusic();
//        init-destroy method
//        System.out.println(applicationContext.getBean("classicMusic", ClassicMusic.class).getSong());
//        System.out.println(applicationContext.getBean("classicMusic", ClassicMusic.class).getSong());
		applicationContext.close();
	}
}
