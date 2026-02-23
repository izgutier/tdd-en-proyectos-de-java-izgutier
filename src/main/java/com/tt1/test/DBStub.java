package com.tt1.repository;

import com.tt1.model.ToDo;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DBStub {
    private List<ToDo> tareas = new ArrayList<>();

    public void guardar(ToDo tarea) {
        tareas.add(tarea);
    }

    public List<ToDo> obtenerTodas() {
        return new ArrayList<>(tareas);
    }

    public Optional<ToDo> buscarPorNombre(String nombre) {
        return tareas.stream()
                .filter(t -> t.getNombre().equalsIgnoreCase(nombre))
                .findFirst();
    }

    public boolean borrarPorNombre(String nombre) {
        return tareas.removeIf(t -> t.getNombre().equalsIgnoreCase(nombre));
    }

    public void vaciar() {
        tareas.clear();
    }
    
    public int totalTareas() {
        return tareas.size();
    }
}
