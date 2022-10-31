package com.example.dgs_framework.Types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Subscription implements ISubscription {
  private IShow showAdded;

  public Subscription() {
  }

  @Override
  public IShow getShowAdded() {
    return showAdded;
  }

  public void setShowAdded(IShow showAdded) {
    this.showAdded = showAdded;
  }

  @Override
  public String toString() {
    return "Subscription{" + "showAdded='" + showAdded + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return java.util.Objects.equals(showAdded, that.showAdded);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(showAdded);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private IShow showAdded;

    public Subscription build() {
      Subscription result = new Subscription();
          result.showAdded = this.showAdded;
          return result;
    }

    public Builder showAdded(IShow showAdded) {
      this.showAdded = showAdded;
      return this;
    }
  }
}
