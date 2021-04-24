package com.sadovsky.spring.part2AnnotationBean.videos;

import org.springframework.stereotype.Component;

@Component
public class Movies implements Video {

    @Override
    public void seeVideo() {
        System.out.println("Started Movies");
    }
}
