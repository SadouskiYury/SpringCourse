package com.sadovsky.spring.part1XMLBean.music.types;

import com.sadovsky.spring.part1XMLBean.music.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock Song";
    }
}
