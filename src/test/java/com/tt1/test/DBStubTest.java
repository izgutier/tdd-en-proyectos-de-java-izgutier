package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DBStubTest {
    @Test
    void testInsertarEmailEnAgenda() {
        DBStub db = new DBStub();
        String email = "alumno@unirioja.es";
        
        db.insertarEmail(email);
        
        assertTrue(db.getAgenda().contains(email));
    }
}
