package org.hibernate.bugs;

import jakarta.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class EmbeddableBarCompositeKey {
  private long idClassFooId;
  private String createdBy;
  private LocalDateTime createdDate;

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
