package com.example.dgs_framework.Types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ShowSort {
  private Sort title;

  private Sort releaseYear;

  public ShowSort() {
  }

  public Sort getTitle() {
    return title;
  }

  public void setTitle(Sort title) {
    this.title = title;
  }

  public Sort getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Sort releaseYear) {
    this.releaseYear = releaseYear;
  }

  @Override
  public String toString() {
    return "ShowSort{" + "title='" + title + "'," +"releaseYear='" + releaseYear + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowSort that = (ShowSort) o;
        return java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(releaseYear, that.releaseYear);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(title, releaseYear);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private Sort title;

    private Sort releaseYear;

    public ShowSort build() {
                  ShowSort result = new ShowSort();
                      result.title = this.title;
          result.releaseYear = this.releaseYear;
                      return result;
    }

    public Builder title(Sort title) {
      this.title = title;
      return this;
    }

    public Builder releaseYear(Sort releaseYear) {
      this.releaseYear = releaseYear;
      return this;
    }
  }
}
