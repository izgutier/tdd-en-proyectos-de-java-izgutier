package com.tt1.test;

import java.util.logging.Logger;

public class MailerStub {
    public boolean enviar(String destinatario, String mensaje) {
        System.out.println("Enviando correo a: " + destinatario + " | Mensaje: " + mensaje);
        return true;
    }
}
