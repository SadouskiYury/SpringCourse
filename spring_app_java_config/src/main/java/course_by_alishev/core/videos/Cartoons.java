package course_by_alishev.core.videos;

import org.springframework.stereotype.Component;

@Component
public class Cartoons implements Video {
    @Override
    public void seeVideo() {
        System.out.println("Started Cartoons");
    }
}
