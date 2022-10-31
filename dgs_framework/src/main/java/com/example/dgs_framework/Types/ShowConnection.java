package com.example.dgs_framework.Types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import graphql.relay.PageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

/**
 * MessageConnection
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShowConnection implements IShowConnection {
  /**
   * Field edges
   */
  private List<IShowEdge> edges;

  /**
   * Field pageInfo
   */
  private PageInfo pageInfo;

  public ShowConnection() {
  }

  /**
   * Field edges
   */
  @Override
  public List<IShowEdge> getEdges() {
    return edges;
  }

  public void setEdges(List<IShowEdge> edges) {
    this.edges = edges;
  }

  /**
   * Field pageInfo
   */
  @Override
  public PageInfo getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }

  @Override
  public String toString() {
    return "ShowConnection{" + "edges='" + edges + "'," +"pageInfo='" + pageInfo + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowConnection that = (ShowConnection) o;
        return java.util.Objects.equals(edges, that.edges) &&
                            java.util.Objects.equals(pageInfo, that.pageInfo);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(edges, pageInfo);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Field edges
     */
    private List<IShowEdge> edges;

    /**
     * Field pageInfo
     */
    private PageInfo pageInfo;

    public ShowConnection build() {
                  ShowConnection result = new ShowConnection();
                      result.edges = this.edges;
          result.pageInfo = this.pageInfo;
                      return result;
    }

    /**
     * Field edges
     */
    public Builder edges(List<IShowEdge> edges) {
      this.edges = edges;
      return this;
    }

    /**
     * Field pageInfo
     */
    public Builder pageInfo(PageInfo pageInfo) {
      this.pageInfo = pageInfo;
      return this;
    }
  }
}
