package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class UsersGraphQLQuery extends GraphQLQuery {
  public UsersGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "users";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public UsersGraphQLQuery build() {
      return new UsersGraphQLQuery();                                     
    }
  }
}
