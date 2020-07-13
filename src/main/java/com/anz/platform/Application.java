package com.anz.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableSpringConfigured
@EnableJpaAuditing
@ComponentScan(basePackages = {"com.anz.platform"})
public class Application {
  public static void main(final String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
