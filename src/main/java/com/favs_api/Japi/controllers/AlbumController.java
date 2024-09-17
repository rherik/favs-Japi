package com.favs_api.Japi.controllers;

import com.favs_api.Japi.models.AlbumVO;
import com.favs_api.Japi.services.AlbumVOServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumVOController {
    @Autowired
    private AlbumVOServices service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AlbumVO> findAll(){
        return service.findAll();
    }

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AlbumVO findById(@PathVariable(value = "id") Long id) throws Exception {
        return service.findById(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public AlbumVO create(@RequestBody AlbumVO album){
        return service.create(album);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public AlbumVO update(@RequestBody AlbumVO album){
        return service.create(album);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable (value = "id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
