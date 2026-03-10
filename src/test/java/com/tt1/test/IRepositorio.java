package com.tt1.test;

import java.util.List;

public interface IRepositorio {
    void guardarTarea(ToDo tarea);
    ToDo encontrarPorNombre(String nombre);
    List<ToDo> obtenerTodosLosToDos();
    void marcarComoCompletado(String nombre);
}