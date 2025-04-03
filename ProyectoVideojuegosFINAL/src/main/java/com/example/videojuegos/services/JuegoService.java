package com.example.videojuegos.services;

import com.example.videojuegos.model.Juego;
import java.util.List;
import java.util.Optional;

public interface JuegoService {
    Juego save(Juego juego);
    List<Juego> findAll();
    Optional<Juego> findById(Long id);
    void deleteById(Long id);
}
