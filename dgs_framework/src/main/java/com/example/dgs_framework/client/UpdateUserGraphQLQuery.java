package com.example.dgs_framework.client;

import com.example.dgs_framework.Types.UserInput;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class UpdateUserGraphQLQuery extends GraphQLQuery {
  public UpdateUserGraphQLQuery(String email, UserInput user, Set<String> fieldsSet) {
    super("mutation");
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }if (user != null || fieldsSet.contains("user")) {
        getInput().put("user", user);
    }
  }

  public UpdateUserGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "updateUser";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String email;

    private UserInput user;

    public UpdateUserGraphQLQuery build() {
      return new UpdateUserGraphQLQuery(email, user, fieldsSet);
               
    }

    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    public Builder user(UserInput user) {
      this.user = user;
      this.fieldsSet.add("user");
      return this;
    }
  }
}
