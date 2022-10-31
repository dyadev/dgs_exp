package com.example.dgs_framework.Types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserInput {
  private String nom;

  private String prenom;

  private String mail;

  private String password;

  public UserInput() {
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "UserInput{" + "nom='" + nom + "'," +"prenom='" + prenom + "'," +"mail='" + mail + "'," +"password='" + password + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInput that = (UserInput) o;
        return java.util.Objects.equals(nom, that.nom) &&
                            java.util.Objects.equals(prenom, that.prenom) &&
                            java.util.Objects.equals(mail, that.mail) &&
                            java.util.Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(nom, prenom, mail, password);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String nom;

    private String prenom;

    private String mail;

    private String password;

    public UserInput build() {
                  UserInput result = new UserInput();
                      result.nom = this.nom;
          result.prenom = this.prenom;
          result.mail = this.mail;
          result.password = this.password;
                      return result;
    }

    public Builder nom(String nom) {
      this.nom = nom;
      return this;
    }

    public Builder prenom(String prenom) {
      this.prenom = prenom;
      return this;
    }

    public Builder mail(String mail) {
      this.mail = mail;
      return this;
    }

    public Builder password(String password) {
      this.password = password;
      return this;
    }
  }
}
