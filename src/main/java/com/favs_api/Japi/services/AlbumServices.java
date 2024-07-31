package com.favs_api.Japi.services;

import com.favs_api.Japi.models.Album;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class AlbumServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(AlbumServices.class.getName());
    public Album findById(String id){
        logger.info("Finding one album");
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
}
