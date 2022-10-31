package com.example.dgs_framework.Datafetchers;

import com.example.dgs_framework.Types.User;
import com.example.dgs_framework.Types.UserInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@DgsComponent
public class UsersDatafetcher {

  List<User> users  = List.of(
          User.newBuilder()
                  .mail("admin@gmail.com")
                  .password("jper")
                  .prenom(null)
                  .nom("masque")
                  .build(),
          User.newBuilder()
                  .mail("ad2min@gmail.com")
                  .password("jper")
                  .prenom(null)
                  .nom("masque")
                  .build(),
          User.newBuilder()
                  .mail("admin1@gmail.com")
                  .password("jper")
                  .prenom(null)
                  .nom("masque")
                  .build(),
          User.newBuilder()
                  .mail("admin2@gmail.com")
                  .password("jper")
                  .prenom(null)
                  .nom("masque")
                  .build(),
          User.newBuilder()
                  .mail("admi4n@gmail.com")
                  .password("jper")
                  .prenom(null)
                  .nom("masque")
                  .build()
  );

  @DgsData(
      parentType = "Query",
      field = "users"
  )
  public List<User> getUsers(DataFetchingEnvironment dataFetchingEnvironment) {
    return users;
  }

  @DgsData(
          parentType = "Mutation",
          field = "addUser"
  )
  public User setUser(@InputArgument UserInput user){
    return User.newBuilder()
            .nom(user.getNom())
            .mail(user.getMail())
            .prenom(user.getPrenom())
            .password(user.getPassword())
            .build();
  }

  @DgsData(
          parentType = "Mutation",
          field = "deleteUser"
  )
  public String deleteUser(@InputArgument String email){
    if(users.remove(users.stream().filter(user -> user.getMail().equals(email)).collect(Collectors.toList()).get(0))){
      return "Delete Successfully";
    }else{
      return "Error";
    }

  }

  @DgsData(
          parentType = "Mutation",
          field = "updateUser"
  )
  public Optional<User> updateUser(@InputArgument String email, @InputArgument UserInput user){
    User nU = users.stream().filter(u -> u.getMail().equals(email)).collect(Collectors.toList()).get(0);
    if(nU != null){
      nU.setMail(user.getMail());
      nU.setNom(user.getNom());
      nU.setPassword(user.getPassword());
      return Optional.of(nU);
    }

    return null;
  }
}
