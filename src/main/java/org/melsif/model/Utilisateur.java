package org.melsif.model;

import javax.persistence.*;

/**
 * Created by fliou on 28/09/17.
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "discriminator")
@DiscriminatorValue("utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nom;

    private String prenom;

    private String email;

    private String telephone;

    private String username;

    private String password;

    private String[] Authorities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getAuthorities() {
        return Authorities;
    }

    public void setAuthorities(String[] authorities) {
        Authorities = authorities;
    }
}
