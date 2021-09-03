package part2_annotation_beans;

import org.junit.Assert;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part2_annotation_beans.players.MusicPlayer;
import part2_annotation_beans.players.Player;
import part2_annotation_beans.players.VideoPlayer;

public class SpringMain2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		//		check scope prototype
		Player player = applicationContext.getBean("vPl", VideoPlayer.class);
		Player player2 = applicationContext.getBean("vPl", VideoPlayer.class);
		Assert.assertNotEquals("As scope prototype object should be different", player.hashCode(), player2.hashCode());
		//		check scope singleton by default
		Player musicPlayer = applicationContext.getBean("mPl", MusicPlayer.class);
		Player musicPlayer1 = applicationContext.getBean("mPl", MusicPlayer.class);
		Assert.assertEquals(musicPlayer.hashCode(), musicPlayer1.hashCode());


		Computer computer = applicationContext.getBean("computer", Computer.class);
		computer.turnOnPlayer();
		applicationContext.close();
	}
}
