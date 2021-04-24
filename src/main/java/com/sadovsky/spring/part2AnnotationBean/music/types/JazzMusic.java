package com.sadovsky.spring.part2AnnotationBean.music.types;

import com.sadovsky.spring.part2AnnotationBean.music.Music;
import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "This is Jazz";
    }
}
