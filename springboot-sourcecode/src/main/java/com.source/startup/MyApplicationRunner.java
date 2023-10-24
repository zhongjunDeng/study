package com.source.startup;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class MyApplicationRunner implements ApplicationRunner {
    //参数为
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner start...");
        String[] sourceArgs = args.getSourceArgs();
        for (String sourceArg : sourceArgs) {
            System.out.println(sourceArg);
        }
    }
}
