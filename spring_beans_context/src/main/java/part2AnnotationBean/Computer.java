package part2AnnotationBean;

import part2AnnotationBean.players.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private Player player1;
    private Player player;
    private int id;

    @Autowired
    public Computer(@Qualifier("musicPlayer")Player player,@Qualifier("videoPlayer") Player player1) {
        this.player = player;
        this.player1 = player1;
        this.id = 1;
    }

    public void turnOnPlayer(){
        player.play();
        player1.play();
    }
}
