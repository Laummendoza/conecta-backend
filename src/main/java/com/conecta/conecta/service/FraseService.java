package com.conecta.conecta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.conecta.conecta.entity.Frase;
import com.conecta.conecta.repository.FraseRepository;

@Service
public class FraseService {

    private final FraseRepository fraseRepository;

    public FraseService(FraseRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }
//obtener todas las frases
    public List<Frase> getAllFrases() {
        return fraseRepository.findAll();
    }
//guardar frase
    public Frase saveFrase(Frase frase) {
        return fraseRepository.save(frase);
    }
// Buscar frases por palabra clave. Muestra todas las frases disponibles (case-insensitive)
    public List<Frase> getFrasesPorPalabraClaveExacta(String palabraClave) {
    return fraseRepository.findByPalabraClaveIgnoreCase(palabraClave);
}

    
    

    // Nuevo método para buscar por palabra clave parcial (contenga la palabra)
    public List<Frase> getFrasesPorPalabraClave(String palabraClave) {
        return fraseRepository.findByPalabraClaveContaining(palabraClave);
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }
}
