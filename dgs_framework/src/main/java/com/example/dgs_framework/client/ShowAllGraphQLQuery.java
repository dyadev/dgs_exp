package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ShowAllGraphQLQuery extends GraphQLQuery {
  public ShowAllGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "showAll";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public ShowAllGraphQLQuery build() {
      return new ShowAllGraphQLQuery();                                     
    }
  }
}
