package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class AddItemProjectionRoot extends BaseProjectionNode {
  public AddItemProjectionRoot title() {
    getFields().put("title", null);
    return this;
  }

  public AddItemProjectionRoot releaseYear() {
    getFields().put("releaseYear", null);
    return this;
  }
}
