package com.example.dgs_client;

import com.example.dgs_framework.Types.*;
import com.example.dgs_framework.client.ShowAllGraphQLQuery;
import com.example.dgs_framework.client.ShowAllProjectionRoot;
import com.example.dgs_framework.client.ShowsProjectionRoot;
import com.netflix.graphql.dgs.client.GraphQLResponse;
import com.netflix.graphql.dgs.client.MonoGraphQLClient;
import com.netflix.graphql.dgs.client.WebClientGraphQLClient;
import com.netflix.graphql.dgs.client.codegen.GraphQLQueryRequest;
import graphql.relay.SimpleListConnection;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Instanceof;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.reactive.function.client.WebClient;
import com.example.dgs_framework.client.ShowsGraphQLQuery;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DgsClientApplication implements CommandLineRunner {

    DataFetchingEnvironment dataFetchingEnvironment;

    public static void main(String[] args) {
        SpringApplication.run(DgsClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("Init");
        try {
            //Création du client HTTP
            WebClient webClient = WebClient.create("http://localhost:9001/graphql");
            log.info("Webclient created");

            //création du client GraphQL
            WebClientGraphQLClient client = MonoGraphQLClient.createWithWebClient(webClient);
            log.info("WebClientGraphQLClient created");

            //Création du paramètre de tri
            ShowSort s = ShowSort.newBuilder()
                    .title(Sort.asc)
                    .build();

            //Construction de la ma Query
            ShowsGraphQLQuery showsGraphQLQuery = ShowsGraphQLQuery.newRequest()
                    .first(5)
                    .sort(s)
                    .build();

            //Creation de la requête qui serra envoyé
            GraphQLQueryRequest graphQLQueryRequest = new GraphQLQueryRequest(
                    showsGraphQLQuery,
                    new ShowsProjectionRoot()
                            .pageInfo()
                                .hasNextPage()
                                .hasPreviousPage()
                                .startCursor()
                                .endCursor()
                            .getParent()
                            .edges()
                                .cursor()
                                .node()
                                    .title()
                                    .releaseYear()

            );

            //Récuperation de la réponse obtenu suite à la requête envoyé
            GraphQLResponse graphQLResponseMono = client.reactiveExecuteQuery(graphQLQueryRequest.serialize()).block();

            log.info("#100: {}",graphQLResponseMono.toString());

            //Extraction de donnée de la réponse
            Mono somefield = Mono.just(graphQLResponseMono.getData().get(showsGraphQLQuery.getOperationName()));

            log.info("Data extracted from Response");
            somefield.subscribe(r-> {
                ArrayList edges = (ArrayList) ((LinkedHashMap<String, ?>) r).get("edges");

                edges.stream().forEach(i -> System.out.println( i));
            });

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
