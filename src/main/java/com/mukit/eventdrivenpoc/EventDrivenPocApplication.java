package com.mukit.eventdrivenpoc;

import com.mukit.eventdrivenpoc.config.AwsConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AwsConfigProperties.class)
public class EventDrivenPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventDrivenPocApplication.class, args);
    }

}
