package com.sadovsky.spring.part2AnnotationBean.players;

import com.sadovsky.spring.part2AnnotationBean.music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.lang.String.format;

@Component()
public class MusicPlayer implements Player {
//    aplicable for field as well
//    @Autowired
    private List<Music> music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    //IoC
    @Autowired
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void setMusic(List<Music> music) {
        this.music = music;
    }

    private void playMusic() {
        music.forEach(s -> System.out.println(s.getSong()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void play() {
        System.out.println(format("Player: %s\nVolume: %s\n\n", name,volume));
        playMusic();
    }
}
