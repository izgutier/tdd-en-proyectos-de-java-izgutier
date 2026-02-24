package com.tt1.test;

import com.tt1.test.ToDo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DBStub {
    private Set<String> agendaEmails = new HashSet<>();

    public void insertarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> getTodasLasTareas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void insertarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public Set<String> getAgenda() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
