package com.universidad.reservaslabs.exception;

/**
 * Señala que una reserva viola una regla de negocio de conflicto: horario
 * solapado con otra reserva activa, horario fuera de atención, duración
 * inválida o cancelación de una reserva que ya inició. Se distingue de
 * {@link RecursoNoEncontradoException} para poder mapearse a códigos HTTP
 * distintos (409 frente a 404) y a presentaciones distintas en el
 * controlador MVC.
 */
public class ReservaConflictException extends RuntimeException {
    public ReservaConflictException(String mensaje) { super(mensaje); }
}
