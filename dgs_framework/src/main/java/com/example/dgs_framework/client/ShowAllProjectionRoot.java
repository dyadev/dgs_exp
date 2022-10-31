package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class ShowAllProjectionRoot extends BaseProjectionNode {
  public ShowAllProjectionRoot title() {
    getFields().put("title", null);
    return this;
  }

  public ShowAllProjectionRoot releaseYear() {
    getFields().put("releaseYear", null);
    return this;
  }
}
