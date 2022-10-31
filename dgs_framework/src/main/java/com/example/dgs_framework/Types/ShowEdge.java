package com.example.dgs_framework.Types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

/**
 * MessageEdge
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShowEdge implements IShowEdge {
  /**
   * Field node
   */
  private IShow node;

  /**
   * Field cursor
   */
  private String cursor;

  public ShowEdge() {
  }

  /**
   * Field node
   */
  @Override
  public IShow getNode() {
    return node;
  }

  public void setNode(IShow node) {
    this.node = node;
  }

  /**
   * Field cursor
   */
  @Override
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  @Override
  public String toString() {
    return "ShowEdge{" + "node='" + node + "'," +"cursor='" + cursor + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowEdge that = (ShowEdge) o;
        return java.util.Objects.equals(node, that.node) &&
                            java.util.Objects.equals(cursor, that.cursor);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(node, cursor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Field node
     */
    private IShow node;

    /**
     * Field cursor
     */
    private String cursor;

    public ShowEdge build() {
                  ShowEdge result = new ShowEdge();
                      result.node = this.node;
          result.cursor = this.cursor;
                      return result;
    }

    /**
     * Field node
     */
    public Builder node(IShow node) {
      this.node = node;
      return this;
    }

    /**
     * Field cursor
     */
    public Builder cursor(String cursor) {
      this.cursor = cursor;
      return this;
    }
  }
}
