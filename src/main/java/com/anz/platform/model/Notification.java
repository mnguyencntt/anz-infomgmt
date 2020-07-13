package com.anz.platform.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import lombok.Data;

@Data
@Entity
public class Notification {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String receiverUserId;

  private String subject;
  private String contentBody;

  private String notificationType;
  private String amount;
  private String status;
  private String message;
  private String request; // store request of API

  private LocalDateTime createdAt;
  private String createdBy;
  private LocalDateTime updatedAt;
  private String updatedBy;

  @PostPersist
  public void onPersist() {
    createdAt = LocalDateTime.now();
    updatedAt = LocalDateTime.now();
  }

  @PostUpdate
  public void onUpdate() {
    updatedAt = LocalDateTime.now();
  }
}
