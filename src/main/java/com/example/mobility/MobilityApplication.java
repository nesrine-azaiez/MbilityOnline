package com.example.mobility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableJpaRepositories
@EnableScheduling
@EnableSwagger2
@SpringBootApplication
public class MobilityApplication {
// hiiiiiii
    public static void main(String[] args) {
        SpringApplication.run(MobilityApplication.class, args);
    }

}
