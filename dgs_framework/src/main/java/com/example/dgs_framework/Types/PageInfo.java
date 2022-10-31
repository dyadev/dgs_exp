package com.example.dgs_framework.Types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * PageInfo
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class PageInfo implements IPageInfo {
  /**
   * Field hasPreviousPage
   */
  private boolean hasPreviousPage;

  /**
   * Field hasNextPage
   */
  private boolean hasNextPage;

  /**
   * Field startCursor
   */
  private String startCursor;

  /**
   * Field endCursor
   */
  private String endCursor;

  public PageInfo() {
  }

  /**
   * Field hasPreviousPage
   */
  @Override
  public boolean getHasPreviousPage() {
    return hasPreviousPage;
  }

  public void setHasPreviousPage(boolean hasPreviousPage) {
    this.hasPreviousPage = hasPreviousPage;
  }

  /**
   * Field hasNextPage
   */
  @Override
  public boolean getHasNextPage() {
    return hasNextPage;
  }

  public void setHasNextPage(boolean hasNextPage) {
    this.hasNextPage = hasNextPage;
  }

  /**
   * Field startCursor
   */
  @Override
  public String getStartCursor() {
    return startCursor;
  }

  public void setStartCursor(String startCursor) {
    this.startCursor = startCursor;
  }

  /**
   * Field endCursor
   */
  @Override
  public String getEndCursor() {
    return endCursor;
  }

  public void setEndCursor(String endCursor) {
    this.endCursor = endCursor;
  }

  @Override
  public String toString() {
    return "PageInfo{" + "hasPreviousPage='" + hasPreviousPage + "'," +"hasNextPage='" + hasNextPage + "'," +"startCursor='" + startCursor + "'," +"endCursor='" + endCursor + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PageInfo that = (PageInfo) o;
        return hasPreviousPage == that.hasPreviousPage &&
                            hasNextPage == that.hasNextPage &&
                            java.util.Objects.equals(startCursor, that.startCursor) &&
                            java.util.Objects.equals(endCursor, that.endCursor);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(hasPreviousPage, hasNextPage, startCursor, endCursor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Field hasPreviousPage
     */
    private boolean hasPreviousPage;

    /**
     * Field hasNextPage
     */
    private boolean hasNextPage;

    /**
     * Field startCursor
     */
    private String startCursor;

    /**
     * Field endCursor
     */
    private String endCursor;

    public PageInfo build() {
                  PageInfo result = new PageInfo();
                      result.hasPreviousPage = this.hasPreviousPage;
          result.hasNextPage = this.hasNextPage;
          result.startCursor = this.startCursor;
          result.endCursor = this.endCursor;
                      return result;
    }

    /**
     * Field hasPreviousPage
     */
    public Builder hasPreviousPage(
        boolean hasPreviousPage) {
      this.hasPreviousPage = hasPreviousPage;
      return this;
    }

    /**
     * Field hasNextPage
     */
    public Builder hasNextPage(boolean hasNextPage) {
      this.hasNextPage = hasNextPage;
      return this;
    }

    /**
     * Field startCursor
     */
    public Builder startCursor(String startCursor) {
      this.startCursor = startCursor;
      return this;
    }

    /**
     * Field endCursor
     */
    public Builder endCursor(String endCursor) {
      this.endCursor = endCursor;
      return this;
    }
  }
}
