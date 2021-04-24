package com.sadovsky.spring.part2AnnotationBean.music.types;

import com.sadovsky.spring.part2AnnotationBean.music.Music;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements Music {
    private ClassicMusic(){}

    @Override
    public String getSong() {
        return "Classic Song";
    }
}
