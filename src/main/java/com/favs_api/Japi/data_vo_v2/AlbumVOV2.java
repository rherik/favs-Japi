package com.favs_api.Japi.data_vo_v2;

import java.io.Serializable;

import java.util.Objects;

public class AlbumVOV2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String release;
    private String author;
    private String description;
    private String kind;
    private String foto;
    private Integer rate;
    private Integer songs;

    public AlbumVOV2() {}

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

    public Integer getSongs() {
        return songs;
    }

    public void setSongs(Integer songs) {
        this.songs = songs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumVOV2 albumVOV2 = (AlbumVOV2) o;
        return Objects.equals(id, albumVOV2.id) && Objects.equals(name, albumVOV2.name) && Objects.equals(release, albumVOV2.release) && Objects.equals(author, albumVOV2.author) && Objects.equals(description, albumVOV2.description) && Objects.equals(kind, albumVOV2.kind) && Objects.equals(foto, albumVOV2.foto) && Objects.equals(rate, albumVOV2.rate) && Objects.equals(songs, albumVOV2.songs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, release, author, description, kind, foto, rate, songs);
    }
}
