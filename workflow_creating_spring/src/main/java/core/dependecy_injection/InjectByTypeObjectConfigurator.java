package core.dependecy_injection;

import core.app.ApplicationContext;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeObjectConfigurator implements ObjectConfigurator {

	@Override
	@SneakyThrows
	public void configure(Object obj, ApplicationContext context) {
		for (Field field : obj.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(InjectByType.class)) {
				field.setAccessible(true);
				Object object = context.getObject(field.getType());
				field.set(obj, object);
			}
		}
	}

}
