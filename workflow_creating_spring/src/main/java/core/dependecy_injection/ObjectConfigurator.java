package core.dependecy_injection;

import core.app.ApplicationContext;

public interface ObjectConfigurator {
	void configure(Object obj, ApplicationContext context);
}
