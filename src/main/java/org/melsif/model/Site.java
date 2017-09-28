package org.melsif.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by fliou on 28/09/17.
 */

@Entity
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String url;

    private String ip;

    @ManyToMany
    private List<Theme> themes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Theme> getThemes() {
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }
}
