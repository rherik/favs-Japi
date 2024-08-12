package com.favs_api.Japi.repositories;

import com.favs_api.Japi.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository <Album, Long> {}
