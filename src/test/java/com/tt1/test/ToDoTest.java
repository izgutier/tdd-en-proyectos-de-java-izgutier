package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;


class ToDoTest {

	@Test
    void testCrearYConsultarToDo() {
        String nombre = "Practica 3";
        LocalDate fecha = LocalDate.now().plusDays(7);
        
        ToDo tarea = new ToDo(nombre, "Finalizar tests", fecha);
        
        assertEquals(nombre, tarea.getNombre()); 
        assertEquals(fecha, tarea.getFechaLimite());
        
    }

}
