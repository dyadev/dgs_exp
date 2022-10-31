package com.example.dgs_framework.Types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class User implements IUser {
  private String nom;

  private String prenom;

  private String mail;

  private String password;

  public User() {
  }

  @Override
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  @Override
  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  @Override
  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  @Override
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "User{" + "nom='" + nom + "'," +"prenom='" + prenom + "'," +"mail='" + mail + "'," +"password='" + password + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
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

    public User build() {
                  User result = new User();
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
