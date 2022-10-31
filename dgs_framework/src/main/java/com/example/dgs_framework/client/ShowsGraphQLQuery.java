package com.example.dgs_framework.client;

import com.example.dgs_framework.Types.ShowSort;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class ShowsGraphQLQuery extends GraphQLQuery {
  public ShowsGraphQLQuery(int first, String after, String titleFilter, ShowSort sort,
      Set<String> fieldsSet) {
    super("query");
    getInput().put("first", first);                   if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (titleFilter != null || fieldsSet.contains("titleFilter")) {
        getInput().put("titleFilter", titleFilter);
    }if (sort != null || fieldsSet.contains("sort")) {
        getInput().put("sort", sort);
    }
  }

  public ShowsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "shows";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private int first;

    private String after;

    private String titleFilter;

    private ShowSort sort;

    public ShowsGraphQLQuery build() {
      return new ShowsGraphQLQuery(first, after, titleFilter, sort, fieldsSet);
               
    }

    public Builder first(int first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    public Builder titleFilter(String titleFilter) {
      this.titleFilter = titleFilter;
      this.fieldsSet.add("titleFilter");
      return this;
    }

    public Builder sort(ShowSort sort) {
      this.sort = sort;
      this.fieldsSet.add("sort");
      return this;
    }
  }
}
