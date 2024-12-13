package com.favs_api.Japi.services;

import com.favs_api.Japi.data_vo_v2.AlbumVOV2;
import com.favs_api.Japi.exceptions.ResourceNotFoundException;
import com.favs_api.Japi.data_vo_v1.AlbumVO;
import com.favs_api.Japi.mapper.DozerMapper;
import com.favs_api.Japi.mapper.custom.AlbumMapper;
import com.favs_api.Japi.models.Album;
import com.favs_api.Japi.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class AlbumServices {

    private Logger logger = Logger.getLogger(AlbumServices.class.getName());

    @Autowired
    AlbumRepository repository;

    @Autowired
    AlbumMapper mapper;

    public List<AlbumVO> findAll(){
        logger.info("Finding all albuns.");

        return DozerMapper.parseListObject(repository.findAll(), AlbumVO.class);
    }

    public AlbumVO findById(Long id){
        logger.info("Finding one album.");

        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        return DozerMapper.parseObject(entity, AlbumVO.class);
    }

    public AlbumVO create (AlbumVO album) {
        logger.info("Creating one album.");
        var entity = DozerMapper.parseObject(album, Album.class);
        var vo = DozerMapper.parseObject(repository.save(entity), AlbumVO.class);
        return vo;
    }

    public AlbumVOV2 createV2 (AlbumVOV2 album) {
        logger.info("Creating one album with V2.");
        var entity = mapper.convertVoToEntity(album);
        var vo = mapper.convertEntityToVo(repository.save(entity));
        return vo;
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

        var vo = DozerMapper.parseObject(repository.save(entity), AlbumVO.class);
        return vo;
    }

    public void delete (Long id) {
        logger.info("deleting one album.");
        var entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found"));
        repository.delete(entity);
    }
}
