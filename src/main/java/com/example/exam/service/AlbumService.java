package com.example.exam.service;

import com.example.exam.model.service.AlbumServiceModel;
import com.example.exam.model.view.AlbumViewModel;
import java.math.BigDecimal;
import java.util.List;

public interface AlbumService {

    void add(AlbumServiceModel albumServiceModel, Long id);

    List<AlbumViewModel> getAllAlbums();

    BigDecimal getTotalCopies();

    void delete(Long id);

}
