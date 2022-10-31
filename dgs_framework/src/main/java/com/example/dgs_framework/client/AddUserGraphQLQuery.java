package com.example.dgs_framework.client;

import com.example.dgs_framework.Types.UserInput;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class AddUserGraphQLQuery extends GraphQLQuery {
  public AddUserGraphQLQuery(UserInput user, Set<String> fieldsSet) {
    super("mutation");
    if (user != null || fieldsSet.contains("user")) {
        getInput().put("user", user);
    }
  }

  public AddUserGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "addUser";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private UserInput user;

    public AddUserGraphQLQuery build() {
      return new AddUserGraphQLQuery(user, fieldsSet);
               
    }

    public Builder user(UserInput user) {
      this.user = user;
      this.fieldsSet.add("user");
      return this;
    }
  }
}
