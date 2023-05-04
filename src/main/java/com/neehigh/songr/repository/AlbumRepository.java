package com.neehigh.songr.repository;

import com.neehigh.songr.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long>{

    public Album findByArtist(String artist);
}