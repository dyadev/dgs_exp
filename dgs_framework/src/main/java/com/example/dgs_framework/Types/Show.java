package com.example.dgs_framework.Types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Show implements IShow {
  private String title;

  private Integer releaseYear;

  public Show() {
  }

  @Override
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  @Override
  public String toString() {
    return "Show{" + "title='" + title + "'," +"releaseYear='" + releaseYear + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Show that = (Show) o;
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
    private String title;

    private Integer releaseYear;

    public Show build() {
                  Show result = new Show();
                      result.title = this.title;
          result.releaseYear = this.releaseYear;
                      return result;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }

    public Builder releaseYear(Integer releaseYear) {
      this.releaseYear = releaseYear;
      return this;
    }
  }
}
