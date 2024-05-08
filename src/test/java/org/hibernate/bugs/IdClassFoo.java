package org.hibernate.bugs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;
import org.apache.logging.log4j.Logger;

@Entity
@IdClass(IdClassFooCompositeKey.class)
public class IdClassFoo {
  @Id private long idClassFooId;
  @Id private String createdBy;
  @Id private LocalDateTime createdDate;
  
  @PrePersist
  void onPersist() {
    this.createdBy = "ANONYMOUS";
    this.createdDate = LocalDateTime.now();
  }

  public long getIdClassFooId() {
    return idClassFooId;
  }

  public void setIdClassFooId(long idClassFooId) {
    this.idClassFooId = idClassFooId;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }
}
