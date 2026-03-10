package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

class RepositorioTest {
    @Test
    void testGuardarYRecuperarTarea() {
        Repositorio repo = new Repositorio();
        ToDo tarea = new ToDo("Examen", "Estudiar", LocalDate.now());
        
        repo.guardarTarea(tarea);
        ToDo resultado = repo.encontrarPorNombre("Examen");
        
        assertNotNull(resultado); 
        assertEquals("Examen", resultado.getNombre());
    }
}
