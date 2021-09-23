package core.app;

import core.app.config.Config;
import core.app.config.JavaConfig;
import core.bean_factory.ObjectFactory;

import java.util.Map;

public class Application {

	public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass) {
		Config config = new JavaConfig(packageToScan, ifc2ImplClass);
		ApplicationContext applicationContext = new ApplicationContext(config);
		ObjectFactory factory = new ObjectFactory(applicationContext);
		applicationContext.setFactory(factory);
		return applicationContext;
	}
}
