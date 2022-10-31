package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class DeleteUserGraphQLQuery extends GraphQLQuery {
  public DeleteUserGraphQLQuery(String email, Set<String> fieldsSet) {
    super("mutation");
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public DeleteUserGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "deleteUser";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String email;

    public DeleteUserGraphQLQuery build() {
      return new DeleteUserGraphQLQuery(email, fieldsSet);
               
    }

    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }
  }
}
