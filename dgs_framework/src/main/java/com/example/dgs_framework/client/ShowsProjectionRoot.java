package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class ShowsProjectionRoot extends BaseProjectionNode {
  public Shows_EdgesProjection edges() {
    Shows_EdgesProjection projection = new Shows_EdgesProjection(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public Shows_PageInfoProjection pageInfo() {
    Shows_PageInfoProjection projection = new Shows_PageInfoProjection(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
