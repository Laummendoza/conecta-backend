package com.conecta.conecta.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conecta.conecta.entity.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    List<Frase> findByPalabraClaveIgnoreCase(String palabraClave);
    List<Frase> findByPalabraClaveContaining(String palabraClave);
}
