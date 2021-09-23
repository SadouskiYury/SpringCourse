package core.app;

import core.app.config.Config;
import core.bean_factory.ObjectFactory;
import core.bean_factory.Singelton;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationContext {
	@Setter
	private ObjectFactory factory;
	private final Map<Class, Object> cache = new ConcurrentHashMap<>();
	@Getter
	private Config config;

	public ApplicationContext(Config config) {
		this.config = config;
	}

	public <T> T getObject(Class<T> type) {
		if (cache.containsKey(type)) {
			return (T) cache.get(type);
		}

		Class<? extends T> implClass = type;
		if (type.isInterface()) {
			implClass = config.getImplClass(type);
		}

		T t = factory.createObject(implClass);

		if (implClass.isAnnotationPresent(Singelton.class)) {
			cache.put(type, t);
		}
		return t;
	}
}
