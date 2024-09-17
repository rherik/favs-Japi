package com.favs_api.Japi.unittest.mapper_mocks;

import java.util.ArrayList;
import java.util.List;

import com.favs_api.Japi.data_vo_v1.AlbumVO;
import com.favs_api.Japi.models.Album;

public class MockAlbum {


    public Album mockEntity() {
        return mockEntity(0);
    }

    public AlbumVO mockVO() {
        return mockVO(0);
    }

    public List<Album> mockEntityList() {
        List<Album> albums = new ArrayList<Album>();
        for (int i = 0; i < 14; i++) {
            albums.add(mockEntity(i));
        }
        return albums;
    }

    public List<AlbumVO> mockVOList() {
        List<AlbumVO> albums = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            albums.add(mockVO(i));
        }
        return albums;
    }

    public Album mockEntity(Integer number) {
        Album album = new Album();
        album.setName("Name Test" + number);
        album.setRelease("Release date Test" + number);
        album.setAuthor("Author name test" + number);
        album.setId(number.longValue());
        album.setDescription("Description Test" + number);
        album.setFoto("Foto name test" + number);
        album.setKind("Kind name test" + number);
        album.setRate(number);
        return album;
    }

    public AlbumVO mockVO(Integer number) {
        AlbumVO album = new AlbumVO();
        album.setName("Name Test" + number);
        album.setRelease("Release date Test" + number);
        album.setAuthor("Author name test" + number);
        album.setId(number.longValue());
        album.setDescription("Description Test" + number);
        album.setFoto("Foto name test" + number);
        album.setKind("Kind name test" + number);
        album.setRate(number);
        return album;
    }

}
