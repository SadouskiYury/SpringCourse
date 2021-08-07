package part2AnnotationBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");


//        MusicPlayer musicPlayer = applicationContext.getBean("player", MusicPlayer.class);
        Computer computer = applicationContext.getBean("computer", Computer.class);

//        musicPlayer.playMusic();
         computer.turnOnPlayer();

        applicationContext.close();
    }
}
