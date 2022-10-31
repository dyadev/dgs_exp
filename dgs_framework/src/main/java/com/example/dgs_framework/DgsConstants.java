package com.example.dgs_framework;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String SUBSCRIPTION_TYPE = "Subscription";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Shows = "shows";

    public static final String ShowAll = "showAll";

    public static final String Users = "users";

    public static class SHOWS_INPUT_ARGUMENT {
      public static final String First = "first";

      public static final String After = "after";

      public static final String TitleFilter = "titleFilter";

      public static final String Sort = "sort";
    }
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddItem = "addItem";

    public static final String AddUser = "addUser";

    public static final String DeleteUser = "deleteUser";

    public static final String UpdateUser = "updateUser";

    public static class ADDITEM_INPUT_ARGUMENT {
      public static final String Add = "add";
    }

    public static class ADDUSER_INPUT_ARGUMENT {
      public static final String User = "user";
    }

    public static class DELETEUSER_INPUT_ARGUMENT {
      public static final String Email = "email";
    }

    public static class UPDATEUSER_INPUT_ARGUMENT {
      public static final String Email = "email";

      public static final String User = "user";
    }
  }

  public static class SHOW {
    public static final String TYPE_NAME = "Show";

    public static final String Title = "title";

    public static final String ReleaseYear = "releaseYear";
  }

  public static class SUBSCRIPTION {
    public static final String TYPE_NAME = "Subscription";

    public static final String ShowAdded = "showAdded";
  }

  public static class USER {
    public static final String TYPE_NAME = "User";

    public static final String Nom = "nom";

    public static final String Prenom = "prenom";

    public static final String Mail = "mail";

    public static final String Password = "password";
  }

  public static class SHOWINPUT {
    public static final String TYPE_NAME = "ShowInput";

    public static final String Title = "title";

    public static final String ReleaseYear = "releaseYear";
  }

  public static class SHOWSORT {
    public static final String TYPE_NAME = "ShowSort";

    public static final String Title = "title";

    public static final String ReleaseYear = "releaseYear";
  }

  public static class USERINPUT {
    public static final String TYPE_NAME = "UserInput";

    public static final String Nom = "nom";

    public static final String Prenom = "prenom";

    public static final String Mail = "mail";

    public static final String Password = "password";
  }
}
