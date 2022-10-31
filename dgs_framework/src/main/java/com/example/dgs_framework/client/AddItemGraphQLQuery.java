package com.example.dgs_framework.client;

import com.example.dgs_framework.Types.ShowInput;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class AddItemGraphQLQuery extends GraphQLQuery {
  public AddItemGraphQLQuery(ShowInput add, Set<String> fieldsSet) {
    super("mutation");
    if (add != null || fieldsSet.contains("add")) {
        getInput().put("add", add);
    }
  }

  public AddItemGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "addItem";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ShowInput add;

    public AddItemGraphQLQuery build() {
      return new AddItemGraphQLQuery(add, fieldsSet);
               
    }

    public Builder add(ShowInput add) {
      this.add = add;
      this.fieldsSet.add("add");
      return this;
    }
  }
}
