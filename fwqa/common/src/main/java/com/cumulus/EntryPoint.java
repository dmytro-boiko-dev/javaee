package com.cumulus;

import com.cumulus.config.DataAccessConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//@Import({DataAcessConfigInspections.class})
@SpringBootApplication
public class EntryPoint {
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EntryPoint.class).properties(getProperties());
    }

    private static Properties getProperties() {
        Properties pro = new Properties();
        pro.put("cumulus.spring.config.location", "classpath:cumulus/");
        return pro;
    }

    public static void main(String[] args) {
        SpringApplication.run(EntryPoint.class, args);
    }
}
