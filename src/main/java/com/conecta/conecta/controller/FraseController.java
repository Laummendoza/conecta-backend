package com.conecta.conecta.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.conecta.conecta.entity.Frase;
import com.conecta.conecta.service.FraseService;

@RestController
@RequestMapping("/frases")
public class FraseController {

    private final FraseService fraseService;

    public FraseController(FraseService fraseService) {
        this.fraseService = fraseService;
    }

    // Obtener todas las frases
    @GetMapping
    public List<Frase> getAllFrases() {
        return fraseService.getAllFrases();
    }

    // Crear una frase
    @PostMapping
    public Frase create(@RequestBody Frase frase) {
        return fraseService.saveFrase(frase);
    }

    // Buscar frases por palabra clave. Trae todas las frases (case-insensitive)
    @GetMapping("/por-clave")
    public ResponseEntity<List<Frase>> getFrasesPorClave(@RequestParam String clave) {
        List<Frase> frases = fraseService.getFrasesPorPalabraClaveExacta(clave);
        if (frases.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(frases);
    }

    // Buscar frases que contengan la palabra clave (parcial)
    @GetMapping("/buscar")
    public ResponseEntity<List<Frase>> buscarFrases(@RequestParam String clave) {
        List<Frase> frases = fraseService.getFrasesPorPalabraClave(clave);
        if (frases.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(frases);
    }
}