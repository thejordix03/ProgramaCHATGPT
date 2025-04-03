package com.example.videojuegos.services;

import com.example.videojuegos.model.Desarrollador;
import java.util.List;
import java.util.Optional;

public interface DesarrolladorService {
    Desarrollador save(Desarrollador desarrollador);
    List<Desarrollador> findAll();
    Optional<Desarrollador> findById(Long id);
    void deleteById(Long id);
}
