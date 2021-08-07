package core.business_objects.transport;

import core.announcers.Announcer;
import core.dependecy_injection.InjectByType;
import core.dependecy_injection.InjectProperty;

import javax.annotation.PostConstruct;

public class Bus implements Transport {

	@InjectByType
	private Announcer announcer;
	@InjectProperty(value = "BUS")
	private String nameBus;

	@PostConstruct
	public void init(){
		announcer.announce(nameBus + "was created\n");
	}
	@Override
	public void start() {
		System.out.println(nameBus + " starts!!!");
	}

	@Override
	public void stop() {
		System.out.println(nameBus + " stopped!!!");
	}

	@Override
	public String getName() {
		return nameBus;
	}
}
