package com.favs_api.Japi.models;

import java.io.Serializable;
import java.util.Objects;

public class Album implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String release;
    private String author;
    private String description;
    private String kind;
    private String foto;
    private Integer rate;

    public Album() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Album album = (Album) o;
        return Objects.equals(id, album.id) && Objects.equals(name, album.name) && Objects.equals(release, album.release) && Objects.equals(author, album.author) && Objects.equals(description, album.description) && Objects.equals(kind, album.kind) && Objects.equals(foto, album.foto) && Objects.equals(rate, album.rate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(release);
        result = 31 * result + Objects.hashCode(author);
        result = 31 * result + Objects.hashCode(description);
        result = 31 * result + Objects.hashCode(kind);
        result = 31 * result + Objects.hashCode(foto);
        result = 31 * result + Objects.hashCode(rate);
        return result;
    }
}
