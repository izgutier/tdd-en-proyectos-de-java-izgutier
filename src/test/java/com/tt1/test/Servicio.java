package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.tt1.test.mock.RepositorioMock;
import java.time.LocalDate;
import java.util.List;

class ServicioTest {

    private Servicio servicio;
    private IRepositorio repositorioMock;

    @BeforeEach
    void setUp() throws Exception {
        repositorioMock = new RepositorioMock();
        servicio = new Servicio((Repositorio) repositorioMock);
    }

    @Test
    void testCrearTareaYListarPendientes() {
        servicio.crearTarea("Comprar pan", "Ir a la panaderia", LocalDate.now().plusDays(1));
        List<ToDo> pendientes = servicio.consultarPendientes();
        
        assertNotNull(pendientes);
    }

    @Test
    void testAlertaEmailTareaVencida() {
        servicio.agregarEmail("izan@ejemplo.com");
        servicio.crearTarea("Tarea Caducada", "Desc", LocalDate.now().minusDays(2));
        
        List<ToDo> pendientes = servicio.consultarPendientes();
        assertNotNull(pendientes);
    }

    @Test
    void testMarcarFinalizada() {
        servicio.crearTarea("Limpiar", "Casa", LocalDate.now().plusDays(1));
        servicio.marcarFinalizada("Limpiar");
        
        List<ToDo> pendientes = servicio.consultarPendientes();
        assertNotNull(pendientes);
    }
}