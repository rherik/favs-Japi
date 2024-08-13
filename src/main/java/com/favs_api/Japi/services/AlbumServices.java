package com.favs_api.Japi.services;

import com.favs_api.Japi.exceptions.ResourceNotFoundException;
import com.favs_api.Japi.models.Album;
import com.favs_api.Japi.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class AlbumServices {

    private Logger logger = Logger.getLogger(AlbumServices.class.getName());

    @Autowired
    AlbumRepository repository;

    public List<Album> findAll(){
        logger.info("Finding all albuns.");

        return repository.findAll();
    }

    public Album findById(Long id){
        logger.info("Finding one album.");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
    }

    public Album create (Album album) {
        logger.info("Creating one album.");
        return repository.save(album);
    }

    public Album update (Album album) {
        logger.info("updating one album.");

        var entity = repository.findById(album.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));

        entity.setName(album.getName());
        entity.setRelease(album.getRelease());
        entity.setAuthor(album.getAuthor());
        entity.setDescription(album.getDescription());
        entity.setKind(album.getKind());
        entity.setFoto(album.getFoto());
        entity.setRate(album.getRate());

        return repository.save(album);
    }

    public void delete (Long id) {
        logger.info("deleting one album.");
        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(entity);
    }
}
