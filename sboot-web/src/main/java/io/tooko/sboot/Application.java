package io.tooko.sboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    static {
        System.setProperty("spring.output.ansi.enabled", "ALWAYS");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
