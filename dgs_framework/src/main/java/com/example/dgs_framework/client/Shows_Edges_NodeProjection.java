package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class Shows_Edges_NodeProjection extends BaseSubProjectionNode<Shows_EdgesProjection, ShowsProjectionRoot> {
  public Shows_Edges_NodeProjection(Shows_EdgesProjection parent, ShowsProjectionRoot root) {
    super(parent, root, java.util.Optional.of("Show"));
  }

  public Shows_Edges_NodeProjection title() {
    getFields().put("title", null);
    return this;
  }

  public Shows_Edges_NodeProjection releaseYear() {
    getFields().put("releaseYear", null);
    return this;
  }
}
