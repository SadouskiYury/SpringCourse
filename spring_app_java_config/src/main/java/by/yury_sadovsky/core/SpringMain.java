package by.yury_sadovsky.core;

import by.yury_sadovsky.core.players.MusicPlayer;
import by.yury_sadovsky.core.players.Player;
import by.yury_sadovsky.core.players.VideoPlayer;
import org.junit.Assert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		//		check scope prototype
		Player player = applicationContext.getBean("vPl", VideoPlayer.class);
		Player player2 = applicationContext.getBean("vPl", VideoPlayer.class);
		Assert.assertNotEquals("As scope prototype object should be different", player.hashCode(), player2.hashCode());
		//		check scope singleton by default
		Player musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
		Player musicPlayer1 = applicationContext.getBean("musicPlayer", MusicPlayer.class);
		Assert.assertEquals(musicPlayer.hashCode(), musicPlayer1.hashCode());


		Computer computer = applicationContext.getBean("computer", Computer.class);
		computer.turnOnPlayer();
		applicationContext.close();
	}
}
