package com.anz.platform.config;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
  private static final Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);

  @PostConstruct
  public void init() {
    logger.info("ApplicationConfig is loading");
  }
}
