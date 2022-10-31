package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class Shows_PageInfoProjection extends BaseSubProjectionNode<ShowsProjectionRoot, ShowsProjectionRoot> {
  public Shows_PageInfoProjection(ShowsProjectionRoot parent, ShowsProjectionRoot root) {
    super(parent, root, java.util.Optional.of("PageInfo"));
  }

  public Shows_PageInfoProjection hasPreviousPage() {
    getFields().put("hasPreviousPage", null);
    return this;
  }

  public Shows_PageInfoProjection hasNextPage() {
    getFields().put("hasNextPage", null);
    return this;
  }

  public Shows_PageInfoProjection startCursor() {
    getFields().put("startCursor", null);
    return this;
  }

  public Shows_PageInfoProjection endCursor() {
    getFields().put("endCursor", null);
    return this;
  }
}
