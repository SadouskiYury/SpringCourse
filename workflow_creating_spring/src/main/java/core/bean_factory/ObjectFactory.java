package core.bean_factory;

import core.app.ApplicationContext;
import core.dependecy_injection.ObjectConfigurator;
import lombok.SneakyThrows;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ObjectFactory {
	private final ApplicationContext context;
	private List<ObjectConfigurator> configurators = new ArrayList<>();

	@SneakyThrows
	public ObjectFactory(ApplicationContext context) {
		this.context = context;
		for (Class<? extends ObjectConfigurator> aClass : context.getConfig().getScanner().getSubTypesOf(ObjectConfigurator.class)) {
			configurators.add(aClass.getDeclaredConstructor().newInstance());
		}
	}

	@SneakyThrows
	public <T> T createObject(Class<T> implClass) {
		T t = create(implClass);
		configure(t);
		invokeInit(implClass, t);
		return t;
	}

	private <T> void invokeInit(Class<T> implClass, T t) throws IllegalAccessException, InvocationTargetException {
		for (Method method : implClass.getMethods()) {
			if (method.isAnnotationPresent(PostConstruct.class)) {
				method.invoke(t);
			}
		}
	}

	private <T> void configure(T t) {
		configurators.forEach(configurators -> configurators.configure(t, context));
	}

	@SneakyThrows
	private <T> T create(Class<T> implClass) {
		T t = implClass.getDeclaredConstructor().newInstance();
		return t;
	}
}
