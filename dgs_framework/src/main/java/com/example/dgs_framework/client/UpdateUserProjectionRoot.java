package com.example.dgs_framework.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class UpdateUserProjectionRoot extends BaseProjectionNode {
  public UpdateUserProjectionRoot nom() {
    getFields().put("nom", null);
    return this;
  }

  public UpdateUserProjectionRoot prenom() {
    getFields().put("prenom", null);
    return this;
  }

  public UpdateUserProjectionRoot mail() {
    getFields().put("mail", null);
    return this;
  }

  public UpdateUserProjectionRoot password() {
    getFields().put("password", null);
    return this;
  }
}
