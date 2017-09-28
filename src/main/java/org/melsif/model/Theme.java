package org.melsif.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by fliou on 28/09/17.
 */

@Entity
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nom;

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
}
