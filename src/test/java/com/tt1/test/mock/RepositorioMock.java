package com.tt1.test.mock;

import com.tt1.test.IRepositorio;
import com.tt1.test.ToDo;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMock implements IRepositorio {
    @Override
    public void guardarTarea(ToDo tarea) {}

    @Override
    public ToDo encontrarPorNombre(String nombre) {
        return new ToDo(nombre, "Mock", null);
    }

    @Override
    public List<ToDo> obtenerTodosLosToDos() {
        return new ArrayList<>();
    }

    @Override
    public void marcarComoCompletado(String nombre) {}
}