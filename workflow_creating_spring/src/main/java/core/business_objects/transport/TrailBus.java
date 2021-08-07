package core.business_objects.transport;

import core.dependecy_injection.InjectProperty;

public class TrailBus implements Transport {
	@InjectProperty(value = "Trail BUS")
	private String name;
	@Override
	public void start() {
		System.out.printf("%s starts\n",name);
	}

	@Override
	public void stop() {
		System.out.printf("%s stopped\n",name);
	}

	@Override
	public String getName() {
		return name;
	}
}
