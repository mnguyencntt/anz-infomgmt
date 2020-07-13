package com.anz.platform.controller;

import com.anz.platform.repository.NotificationRepository;
import com.anz.platform.util.Constants;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.anz.platform.domain.ApiResponse;
import com.anz.platform.model.Notification;

@RestController
@RequestMapping("/notification")
public class NotificationController {
  private static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

  @Autowired
  private NotificationRepository notificationRepository;

  @GetMapping(path = "")
  public ResponseEntity<ApiResponse> getAllNotification() {
    logger.info("get all notification");
    final List<Notification> notifications = notificationRepository.findAll();
    return ResponseEntity.ok(ApiResponse.build(Constants.STATUS_000, notifications));
  }

  @GetMapping(path = "/{notificationId}")
  public ResponseEntity<ApiResponse> getNotificationById(@PathVariable final Long notificationId) {
    logger.info("notificationId: {}", notificationId);
    final Optional<Notification> notification = notificationRepository.findById(notificationId);
    if (notification.isPresent()) {
      return ResponseEntity.ok(ApiResponse.build(Constants.STATUS_000, notification));
    }
    return ResponseEntity.ok(ApiResponse.build(Constants.STATUS_500, notification));
  }

  @GetMapping(path = "/send")
  public ResponseEntity<ApiResponse> send(@RequestParam final String receiverUserId, @RequestParam final String orderId, @RequestParam final String deliveryId) {
    logger.info("receiverUserId: {}, orderId: {}, deliveryId: {}", receiverUserId, orderId, deliveryId);

    Notification notification = new Notification();
    notification.setReceiverUserId(receiverUserId);
    notification.setSubject("Confirmation Order " + orderId);
    notification.setContentBody("Your order has been successful. Our delivery will be in 15 days.");
    notification.setRequest(String.format("receiverUserId: %s, orderId: %s, deliveryId: %s", receiverUserId, orderId, deliveryId));
    notification = notificationRepository.save(notification);

    final ImmutableMap<String, String> dataMap = ImmutableMap.of("notificationId", notification.getId().toString());
    return ResponseEntity.ok(ApiResponse.build(Constants.STATUS_000, dataMap));
  }
}
