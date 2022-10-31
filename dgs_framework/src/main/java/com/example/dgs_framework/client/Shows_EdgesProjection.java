package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class Shows_EdgesProjection extends BaseSubProjectionNode<ShowsProjectionRoot, ShowsProjectionRoot> {
  public Shows_EdgesProjection(ShowsProjectionRoot parent, ShowsProjectionRoot root) {
    super(parent, root, java.util.Optional.of("ShowEdge"));
  }

  public Shows_Edges_NodeProjection node() {
     Shows_Edges_NodeProjection projection = new Shows_Edges_NodeProjection(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public Shows_EdgesProjection cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
