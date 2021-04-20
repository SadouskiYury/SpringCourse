package com.sadovsky.spring.music.types;

import com.sadovsky.spring.music.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock Song";
    }
}
