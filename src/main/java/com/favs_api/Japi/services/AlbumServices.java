package com.favs_api.Japi.services;

import com.favs_api.Japi.models.Album;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class AlbumServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(AlbumServices.class.getName());

    public List<Album> findAll(){
        logger.info("Finding all albuns.");
        List<Album> albuns = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Album album = mockAlbum(i);
            albuns.add(album);
        }
        return albuns;
    }

    public Album findById(String id){
        logger.info("Finding one album.");
        Album album = new Album();
        album.setId(counter.incrementAndGet());
        album.setName("Sobre Crianças, Quadris, Pesadelos e Lições de Casa...");
        album.setRelease("2015");
        album.setAuthor("Emicida");
        album.setDescription("é o segundo álbum de estúdio do brasileiro");
        album.setKind("Rap");
        album.setFoto("None");
        album.setRate(4);
        return album;
    }
    private Album mockAlbum(int i) {
        Album album = new Album();
        album.setId(counter.incrementAndGet());
        album.setName("Album name" + i);
        album.setRelease("Release date" + i);
        album.setAuthor("Author name" + i);
        album.setDescription("Some description" + i);
        album.setKind("Kind" + i);
        album.setFoto("Some photo" + i);
        album.setRate(0);
        return album;

    }

}
