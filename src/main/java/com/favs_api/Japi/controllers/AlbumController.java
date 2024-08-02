package com.favs_api.Japi.controllers;

import com.favs_api.Japi.models.Album;
import com.favs_api.Japi.services.AlbumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumController {
    @Autowired
    private AlbumServices service;

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Album> findAll(){
        return service.findAll();
    }
    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Album findById(@PathVariable(value = "id") String id) throws Exception {
        return service.findById(id);
    }
}
