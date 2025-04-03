package com.example.videojuegos.services;

import com.example.videojuegos.model.Juego;
import com.example.videojuegos.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuegoServiceImpl implements JuegoService {

    @Autowired
    private JuegoRepository juegoRepository;

    @Override
    public Juego save(Juego juego) {
        return juegoRepository.save(juego);
    }

    @Override
    public List<Juego> findAll() {
        return juegoRepository.findAll();
    }

    @Override
    public Optional<Juego> findById(Long id) {
        return juegoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        juegoRepository.deleteById(id);
    }
}
