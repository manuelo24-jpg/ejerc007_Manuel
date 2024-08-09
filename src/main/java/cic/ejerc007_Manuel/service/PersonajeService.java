package cic.ejerc007_Manuel.service;

import cic.ejerc007_Manuel.model.Personaje;

public class PersonajeService {

    public Personaje crearPersonaje(String nombre, int nivel, int salud, int fuerza, int defensa, int velocidad,
            int experiencia) {
        Personaje personaje = new Personaje();
        personaje.setNombre(nombre);
        personaje.setNivel(nivel);
        personaje.setSalud(salud);
        personaje.setFuerza(fuerza);
        personaje.setDefensa(defensa);
        personaje.setVelocidad(velocidad);
        personaje.setExperiencia(experiencia);
        return personaje;
    }

}
