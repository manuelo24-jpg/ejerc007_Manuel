package cic.ejerc007_Manuel.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import cic.ejerc007_Manuel.controller.PersonajeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonajeController.class)
public class PersonajeControllerTest {

    // TAmpoco me voy a pasar
    @Autowired
    private MockMvc mockMvc;

    // Rico test
    @Test
    public void testCrearPersonajeMethodNotAllowed() throws Exception {
       // mockMvc.perform(get("/personaje/crear"))
                .andExpect(status().isMethodNotAllowed());
    }
}