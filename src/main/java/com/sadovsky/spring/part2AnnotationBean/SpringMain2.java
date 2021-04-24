package com.sadovsky.spring.part2AnnotationBean;

import com.sadovsky.spring.part2AnnotationBean.players.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");


//        MusicPlayer musicPlayer = applicationContext.getBean("player", MusicPlayer.class);
        Computer computer = applicationContext.getBean("computer", Computer.class);

//        musicPlayer.playMusic();
         computer.turnOnPlayer();

        applicationContext.close();
    }
}
