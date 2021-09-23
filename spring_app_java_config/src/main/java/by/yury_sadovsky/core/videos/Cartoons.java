package by.yury_sadovsky.core.videos;

import org.springframework.stereotype.Component;

@Component
public class Cartoons implements Video {
    @Override
    public void seeVideo() {
        System.out.println("Started Cartoons");
    }
}
