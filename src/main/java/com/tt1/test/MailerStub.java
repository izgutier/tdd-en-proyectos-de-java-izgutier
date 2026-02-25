package com.tt1.test;

import java.util.logging.Logger;

public class MailerStub {
    public void enviar(String destinatario, String mensaje) {
        LOGGER.info("Enviando correo a: " + destinatario + " | Mensaje: " + mensaje);
    }
}
