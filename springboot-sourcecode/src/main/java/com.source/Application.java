package com.source;

import com.source.initializer.FirstApplicationContextInitializer;
import com.source.listener.FirstListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addInitializers(new FirstApplicationContextInitializer());
        application.addListeners(new FirstListener());
        application.run(args);
        System.out.println("application start...");
    }
}
