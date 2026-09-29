package com.universidad.reservaslabs.exception;

/**
 * Señala que el recurso solicitado (un laboratorio o una reserva) no existe.
 * Se distingue de {@link ReservaConflictException} para mapearse a 404 en
 * lugar de 409.
 */
public class RecursoNoEncontradoException extends RuntimeException {
    public RecursoNoEncontradoException(String mensaje) { super(mensaje); }
}
