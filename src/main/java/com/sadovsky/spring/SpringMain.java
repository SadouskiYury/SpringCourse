package com.sadovsky.spring;

import com.sadovsky.spring.music.Music;
import com.sadovsky.spring.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

//        System.out.println(c);

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
