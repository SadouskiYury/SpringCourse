package core.announcers;

import core.dependecy_injection.InjectProperty;
import lombok.Getter;

public class AnnouncerPropertyConfiguration {
	@Getter
	@InjectProperty(value = "volume: 85")
	private String volume;

	@Getter
	@InjectProperty
	private String repeatingTime;
}
