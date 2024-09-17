package com.favs_api.Japi.services;

import com.favs_api.Japi.exceptions.ResourceNotFoundException;
import com.favs_api.Japi.models.AlbumVO;
import com.favs_api.Japi.repositories.AlbumVORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class AlbumVOServices {

    private Logger logger = Logger.getLogger(AlbumVOServices.class.getName());

    @Autowired
    AlbumVORepository repository;

    public List<AlbumVO> findAll(){
        logger.info("Finding all albuns.");

        return repository.findAll();
    }

    public AlbumVO findById(Long id){
        logger.info("Finding one album.");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
    }

    public AlbumVO create (AlbumVO album) {
        logger.info("Creating one album.");
        return repository.save(album);
    }

    public AlbumVO update (AlbumVO album) {
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
