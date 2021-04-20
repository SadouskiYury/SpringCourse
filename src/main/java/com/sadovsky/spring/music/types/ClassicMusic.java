package com.sadovsky.spring.music.types;

import com.sadovsky.spring.music.Music;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Classic Song";
    }
}
