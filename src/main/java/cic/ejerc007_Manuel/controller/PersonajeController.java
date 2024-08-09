package cic.ejerc007_Manuel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cic.ejerc007_Manuel.model.Personaje;
import cic.ejerc007_Manuel.service.PersonajeService;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    public PersonajeController() {
        this.personajeService = new PersonajeService();
    }

    @PostMapping("crear")
    public Personaje crearPersonaje(String nombre, int nivel, int salud, int fuerza, int defensa, int velocidad,
            int experiencia) {
        return personajeService.crearPersonaje(nombre, nivel, salud, fuerza, defensa, velocidad, experiencia);
    }

}
