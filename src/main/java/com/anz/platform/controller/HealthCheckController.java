package com.anz.platform.controller;

import java.security.Principal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
  @GetMapping("/health")
  public ResponseEntity<String> healthCheck(final Principal principal) {
    return new ResponseEntity<>("AnZ-Platform say 'Hello world!!!'", HttpStatus.OK);
  }
}
