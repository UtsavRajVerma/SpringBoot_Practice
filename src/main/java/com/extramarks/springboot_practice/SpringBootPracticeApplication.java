package com.extramarks.springboot_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackageClasses=SpringBootPracticeApplication.class)
@SpringBootApplication
//@RestController
public class SpringBootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }

}
