package com.restapiproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Properties;

@Configuration
@EnableScheduling
@SpringBootApplication
public class EntryPoint extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EntryPoint.class).properties(getProperties());
    }

    private static Properties getProperties() {
        Properties props = new Properties();
        props.put("spring.config.location", "classpath:restapiproject/");
        return props;
    }

    public static void main(String[] args) {
        SpringApplication.run(EntryPoint.class, args);
    }
}
