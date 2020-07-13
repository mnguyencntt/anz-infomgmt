package com.anz.platform.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.anz.platform.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
  List<Notification> findByReceiverUserId(final String receiverUserId);
}
