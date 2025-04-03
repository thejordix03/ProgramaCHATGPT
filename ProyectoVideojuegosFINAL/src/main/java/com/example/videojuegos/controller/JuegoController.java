package com.example.videojuegos.controller;

import com.example.videojuegos.model.Juego;
import com.example.videojuegos.services.JuegoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/juegos")
public class JuegoController {

    @Autowired
    private JuegoService juegoService;

    @PostMapping
    public Juego crearJuego(@RequestBody Juego juego) {
        return juegoService.save(juego);
    }

    @GetMapping
    public List<Juego> obtenerTodos() {
        return juegoService.findAll();
    }

    @GetMapping("/{id}")
    public Juego obtenerPorId(@PathVariable Long id) {
        Optional<Juego> juego = juegoService.findById(id);
        return juego.orElse(null);  // Devuelve null si no se encuentra el juego
    }

    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable Long id) {
        juegoService.deleteById(id);
    }
}
