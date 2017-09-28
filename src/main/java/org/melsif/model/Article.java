package org.melsif.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by fliou on 27/09/17.
 */

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String titre;

    private String contenu;

    private String description;

    private Date date;

    @ManyToMany
    private List<Theme> themes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }
}
