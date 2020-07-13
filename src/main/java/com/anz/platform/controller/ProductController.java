package com.anz.platform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
  private static final Logger logger = LoggerFactory.getLogger("retrieveCaseNumLog");

  @GetMapping(path = "/create")
  public ResponseEntity<String> retrieveCaseNum(@RequestParam final String productName) {
    logger.info("appName: {}", productName);
    return ResponseEntity.ok(String.format("AnZ-Platform-Testing-Successful: '%s' created", productName));
  }
}
