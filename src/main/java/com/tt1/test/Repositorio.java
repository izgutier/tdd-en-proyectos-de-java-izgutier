package com.tt1.test;


import com.tt1.test.ToDo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Repositorio {


    private final List<ToDo> tareas = new ArrayList<>();
    private final Set<String> agendaEmails = new HashSet<>();


    public void guardarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");    }


    public void guardarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");    }


    public ToDo encontrarPorNombre(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }


    public void marcarComoCompletado(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }


    public List<ToDo> obtenerTodosLosToDos() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }


    public Set<String> obtenerAgenda() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
