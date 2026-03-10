package com.tt1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailerStubTest {

    private MailerStub mailer;

    @BeforeEach
    void setUp() throws Exception {
        mailer = new MailerStub();
    }

    @Test
    void testEnviarRetornaExito() {
        String destinatario = "ejemplo@unirioja.es";
        String mensaje = "Mensaje de prueba";
        
        boolean resultado = mailer.enviar(destinatario, mensaje);
        
        assertTrue(resultado);
    }
}
