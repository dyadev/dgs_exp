package com.example.dgs_framework.Datafetchers;

import com.example.dgs_framework.DgsConstants;
import com.example.dgs_framework.Repository.PagingAndSortRepository;
import com.example.dgs_framework.Services.ShowService;
import com.example.dgs_framework.Types.Show;
import com.example.dgs_framework.Types.ShowInput;
import com.example.dgs_framework.Types.ShowResponse;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import graphql.relay.Connection;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Publisher;
import org.springframework.data.domain.PageRequest;
import reactor.core.publisher.ConnectableFlux;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.stream.Collectors;

@Slf4j
@DgsComponent
public class ShowsDatafetcher {

  private final int element_per_page = 2;
  private FluxSink<Show> showStream;
  private ConnectableFlux<Show> showPublisher;
  ShowService showService;

  @PostConstruct
  public void init() {
    Flux<Show> publisher = Flux.create(emitter -> {
      showStream = emitter;
    });

    showPublisher = publisher.publish();
    showPublisher.connect();
  }


  public ShowsDatafetcher(ShowService showService){
    this.showService = showService;
  }

  @DgsQuery
  public Connection<Show> shows(DataFetchingEnvironment dataFetchingEnvironment) {
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

    log.info("Request send at : {}", LocalDateTime.now().toString());

    String titleFilter = "";

    LinkedHashMap<String, String> sortTypes = dataFetchingEnvironment.getArgument("sort");

    if(dataFetchingEnvironment.getArgument("titleFilter")!=null){
      titleFilter = dataFetchingEnvironment.getArgument("titleFilter");
    }

    String finalTitleFilter = titleFilter;

    return new SimpleListConnection<>(lShow.stream()
            .sorted((obj1, obj2) -> {
              if(sortTypes != null) {
                final String or1 = sortTypes.get("title");
                final String or2 = sortTypes.get("releaseYear");

                if (or2 == null) {
                  log.info("OR_1 choose................");
                  if (or1 != null) {
                    if (or1.equals("desc")) {
                      return obj2.getTitle().compareTo(obj1.getTitle());
                    }
                  }
                } else {

                  log.info("OR_2 choose................");
                    if (or2.equals("asc")) {
                      return obj1.getReleaseYear().compareTo(obj2.getReleaseYear());
                    }
                    return obj2.getReleaseYear().compareTo(obj1.getReleaseYear());
                }

                return obj1.getTitle().compareTo(obj2.getTitle());
              }

              return 1;
            })
            .filter(s -> s.getTitle().contains(finalTitleFilter))
            .collect(Collectors.toList()))
            .get(dataFetchingEnvironment);
  }

  @DgsData(
          parentType = "Mutation",
          field = "addItem"
  )
  public Show addShow(@InputArgument ShowInput add){
    log.info("ADD : {}",add.toString());

    Show ms = showService.addShow(add);
    showStream.next(ms);

    return ms;
  }

  @DgsData(
          parentType = "Subscription",
          field = "showAdded"
  )
  public Publisher<Show> sub_show_added(){
    log.info("showAdded");
    return showPublisher.publish();
  }

  @DgsData(
          parentType = "Query",
          field = "showPages"
  )
  public ShowResponse getShowsbyPage(@InputArgument Integer page){

    if(page<=1){
      page = 0;
    }else {
      page -= 1;
    }

    Long numberOfElement = showService.countOfData();
    double totalPages = numberOfElement/element_per_page;
    totalPages = Math.ceil(totalPages);
    List<Show> data = showService.getContentFromPage(showService.showByPage(PageRequest.of(page, element_per_page)));
    log.info("DATA Result : {}",data);
    return ShowResponse.newBuilder()
            .setTotalItems(data.size())
            .setTotalPages((int) totalPages)
            .setItems(data)
            .setHasNextPage(page<totalPages)
            .setHasPreviousPage(page>1 && totalPages>1)
            .build();
  }

}
