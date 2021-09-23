package by.yury_sadovsky.core;

import by.yury_sadovsky.core.players.Player;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Computer {
	private Player player1;
	private Player player;
	private int id;

	public Computer(Player player, Player player1) {
		this.player = player;
		this.player1 = player1;
		System.out.println("Creating computer");
	}

	@PostConstruct
	public void doMyInit(){
		id = 1;
		System.out.println("Initialization of computer");
	}

	@PreDestroy
	public void destroyComputer(){
		System.out.printf("Destroying of computer: %s%n", id);
	}

	public void turnOnPlayer() {
		player.play();
		player1.play();
	}
}
