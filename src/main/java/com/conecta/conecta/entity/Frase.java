package com.conecta.conecta.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Frase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;
    private String palabraClave; // Nueva propiedad para la palabra clave

    public Frase() {
    }

    public Frase(String texto, String palabraClave) {
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPalabraClave() {
        return palabraClave;
    }
    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }
}