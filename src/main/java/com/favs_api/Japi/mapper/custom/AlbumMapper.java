package com.favs_api.Japi.mapper.custom;

import com.favs_api.Japi.data_vo_v2.AlbumVOV2;
import com.favs_api.Japi.models.Album;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AlbumMapper {
    public AlbumVOV2 convertEntityToVo(Album album) {
        AlbumVOV2 vo = new AlbumVOV2();
        vo.setId(album.getId());
        vo.setName(album.getName());
        vo.setAuthor(album.getAuthor());
        vo.setDescription(album.getDescription());
        vo.setFoto(album.getFoto());
        vo.setKind(album.getKind());
        vo.setSongs(new AlbumVOV2().getSongs());
        vo.setRate(album.getRate());
        vo.setRelease(album.getRelease());
        return vo;
    }
    public Album convertVoToEntity(AlbumVOV2 album) {
        Album entity = new Album();
        entity.setId(album.getId());
        entity.setName(album.getName());
        entity.setAuthor(album.getAuthor());
        entity.setDescription(album.getDescription());
        entity.setFoto(album.getFoto());
        entity.setKind(album.getKind());
        // entity.setSongs(album.getSongs());
        entity.setRate(album.getRate());
        entity.setRelease(album.getRelease());
        return entity;
    }
}
