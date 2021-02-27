package com.example.exam.service;

import com.example.exam.model.entity.ArtistEntity;
import com.example.exam.model.entity.enums.ArtistEnum;

public interface ArtistService {

    void initArtists();

    ArtistEntity findByName(ArtistEnum artistEnum);

}
