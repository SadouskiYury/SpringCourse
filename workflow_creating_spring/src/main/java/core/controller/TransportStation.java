package core.controller;

import core.announcers.Announcer;
import core.bean_factory.Singelton;
import core.business_objects.transport.Transport;
import core.dependecy_injection.InjectByType;

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.String.format;

public class TransportStation {
	private Deque<Transport> que = new ArrayDeque<>();
	private boolean isEmpty = true;

	@InjectByType
	@Singelton
	private Announcer announcer;
	@InjectByType
	private Transport transport;

	public void transportEvent() {
		if (isEmpty) {
			if (!que.isEmpty()) {
				Transport transport = que.poll();
				startEventTransport(transport);
			}
			startEventTransport(transport);
		} else {
			hasTransport();
			System.out.println("You added to que");
			que.addLast(transport);
		}

	}

	private void startEventTransport(Transport transport) {
		transport.stop();
		isEmpty = false;
		announcer.announce(format("%s arrived, passengers can get off", transport.getName()));
		announcer.announce("Passengers can get on");
		transport.start();
		isEmpty = true;
	}

	private void hasTransport() {
		System.out.printf("Station is: %", isEmpty);
	}
}
