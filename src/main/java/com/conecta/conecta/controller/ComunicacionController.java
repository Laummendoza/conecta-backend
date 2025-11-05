package com.conecta.conecta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComunicacionController {

    @GetMapping("/comunicacion")
    public String comunicacion() {
        return "comunicacion"; // apunta a comunicacion.html
    }
}
