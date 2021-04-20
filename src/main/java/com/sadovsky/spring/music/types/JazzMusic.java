package com.sadovsky.spring.music.types;

import com.sadovsky.spring.music.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "This is Jazz";
    }
}
