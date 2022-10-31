package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class UsersProjectionRoot extends BaseProjectionNode {
  public UsersProjectionRoot nom() {
    getFields().put("nom", null);
    return this;
  }

  public UsersProjectionRoot prenom() {
    getFields().put("prenom", null);
    return this;
  }

  public UsersProjectionRoot mail() {
    getFields().put("mail", null);
    return this;
  }

  public UsersProjectionRoot password() {
    getFields().put("password", null);
    return this;
  }
}
