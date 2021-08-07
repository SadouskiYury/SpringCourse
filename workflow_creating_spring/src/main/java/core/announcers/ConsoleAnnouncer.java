package core.announcers;


import core.bean_factory.Singelton;
import core.dependecy_injection.InjectByType;

@Singelton
public class ConsoleAnnouncer implements Announcer {
	@InjectByType
	private AnnouncerPropertyConfiguration propertyConfiguration;

	public ConsoleAnnouncer() {
		System.out.println("Announccer was created");
	}


	@Override
	public void announce(String message) {
		System.out.printf("Volume: %s, Repeating: %s\n%s",propertyConfiguration.getVolume(), propertyConfiguration.getRepeatingTime(), message);
	}
}
