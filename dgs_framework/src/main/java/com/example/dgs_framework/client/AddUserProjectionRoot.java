package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class AddUserProjectionRoot extends BaseProjectionNode {
  public AddUserProjectionRoot nom() {
    getFields().put("nom", null);
    return this;
  }

  public AddUserProjectionRoot prenom() {
    getFields().put("prenom", null);
    return this;
  }

  public AddUserProjectionRoot mail() {
    getFields().put("mail", null);
    return this;
  }

  public AddUserProjectionRoot password() {
    getFields().put("password", null);
    return this;
  }
}
