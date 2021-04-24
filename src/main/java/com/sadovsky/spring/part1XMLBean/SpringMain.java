package com.sadovsky.spring.part1XMLBean;

import com.sadovsky.spring.part1XMLBean.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//        example singltone and prototype scope
        MusicPlayer musicPlayer2 = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer==musicPlayer2);
        System.out.println(musicPlayer.toString());
        System.out.println(musicPlayer2.toString());


        musicPlayer.playMusic();
//        init-destroy method
//        System.out.println(applicationContext.getBean("classicMusic", ClassicMusic.class).getSong());
//        System.out.println(applicationContext.getBean("classicMusic", ClassicMusic.class).getSong());
        applicationContext.close();
    }
}
