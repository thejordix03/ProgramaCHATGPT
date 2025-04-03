package com.example.videojuegos.services;

import com.example.videojuegos.model.Plataforma;
import java.util.List;
import java.util.Optional;

public interface PlataformaService {
    Plataforma save(Plataforma plataforma);
    List<Plataforma> findAll();
    Optional<Plataforma> findById(Long id);
    void deleteById(Long id);
}
