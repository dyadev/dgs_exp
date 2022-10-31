package com.example.dgs_framework.Datafetchers;

import com.example.dgs_framework.Types.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class ShowAllDatafetcher {

  List<Show> lShow = List.of(Show.newBuilder()
                  .title("Spert12")
                  .releaseYear(2032)
                  .build(),
          Show.newBuilder()
                  .title("Spert11")
                  .releaseYear(2031)
                  .build(),
          Show.newBuilder()
                  .title("Spert10")
                  .releaseYear(2030)
                  .build(),
          Show.newBuilder()
                  .title("Spert9")
                  .releaseYear(2029)
                  .build(),
          Show.newBuilder()
                  .title("Spert8")
                  .releaseYear(2028)
                  .build(),
          Show.newBuilder()
                  .title("Spert7")
                  .releaseYear(2027)
                  .build()
  );

  @DgsData(
      parentType = "Query",
      field = "showAll"
  )
  public List<Show> getShowAll(DataFetchingEnvironment dataFetchingEnvironment) {
    return lShow;
  }
}
