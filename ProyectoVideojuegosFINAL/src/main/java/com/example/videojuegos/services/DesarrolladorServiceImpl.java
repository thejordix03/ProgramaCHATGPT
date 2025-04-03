package com.example.videojuegos.services;

import com.example.videojuegos.model.Desarrollador;
import com.example.videojuegos.repository.DesarrolladorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DesarrolladorServiceImpl implements DesarrolladorService {

    @Autowired
    private DesarrolladorRepository desarrolladorRepository;

    @Override
    public Desarrollador save(Desarrollador desarrollador) {
        return desarrolladorRepository.save(desarrollador);
    }

    @Override
    public List<Desarrollador> findAll() {
        return desarrolladorRepository.findAll();
    }

    @Override
    public Optional<Desarrollador> findById(Long id) {
        return desarrolladorRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        desarrolladorRepository.deleteById(id);
    }
}
