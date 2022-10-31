package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class ShowAddedProjectionRoot extends BaseProjectionNode {
  public ShowAddedProjectionRoot title() {
    getFields().put("title", null);
    return this;
  }

  public ShowAddedProjectionRoot releaseYear() {
    getFields().put("releaseYear", null);
    return this;
  }
}
