package core;

import core.app.Application;
import core.app.ApplicationContext;
import core.controller.TransportStation;
import core.business_objects.transport.Bus;
import core.business_objects.transport.Transport;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
//		TransportStation transportStation = ObjectFactory.getInstance().createObject(TransportStation.class);
		ApplicationContext applicationContext = Application.run("core", new HashMap<>(Map.of(Transport.class, Bus.class)));
		TransportStation transportStation = applicationContext.getObject(TransportStation.class);
		transportStation.transportEvent();
	}
}
