package com.example.videojuegos.services;

import com.example.videojuegos.model.Plataforma;
import com.example.videojuegos.repository.PlataformaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlataformaServiceImpl implements PlataformaService {

    @Autowired
    private PlataformaRepository plataformaRepository;

    @Override
    public Plataforma save(Plataforma plataforma) {
        return plataformaRepository.save(plataforma);
    }

    @Override
    public List<Plataforma> findAll() {
        return plataformaRepository.findAll();
    }

    @Override
    public Optional<Plataforma> findById(Long id) {
        return plataformaRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        plataformaRepository.deleteById(id);
    }
}
