package com.example.dgs_framework.Types;

import graphql.relay.PageInfo;
import java.util.List;

public interface IShowConnection {
  List<? extends IShowEdge> getEdges();

  PageInfo getPageInfo();
}
