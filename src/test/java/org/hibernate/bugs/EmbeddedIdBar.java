package org.hibernate.bugs;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import java.time.LocalDateTime;

@Entity
public class EmbeddedIdBar {
  @EmbeddedId private EmbeddableBarCompositeKey embeddableBarCompositeKey;

  @PrePersist
  void onPersist() {
    this.embeddableBarCompositeKey.setCreatedBy("ANONYMOUS");
    this.embeddableBarCompositeKey.setCreatedDate(LocalDateTime.now());
  }

  public EmbeddableBarCompositeKey getEmbeddableBarCompositeKey() {
    return embeddableBarCompositeKey;
  }

  public void setEmbeddableBarCompositeKey(EmbeddableBarCompositeKey embeddableBarCompositeKey) {
    this.embeddableBarCompositeKey = embeddableBarCompositeKey;
  }
}
