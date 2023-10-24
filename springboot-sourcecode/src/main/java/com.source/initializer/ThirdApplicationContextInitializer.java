package com.source.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;

@Order(3)
public class ThirdApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();
        HashMap<String, Object> map = new HashMap<>();
        map.put("key3","value3");
        MapPropertySource firstInitializer = new MapPropertySource("thirdInitializer", map);
        environment.getPropertySources().addFirst(firstInitializer);
        System.out.println("third initializer start...");
    }
}
