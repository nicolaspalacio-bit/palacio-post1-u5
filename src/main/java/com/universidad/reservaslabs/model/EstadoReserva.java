package com.universidad.reservaslabs.model;

/**
 * Ciclo de vida de una {@link Reserva}. Solo las reservas en estado distinto
 * de CANCELADA se consideran "activas" a efectos de detectar solapamientos
 * (ver {@link com.universidad.reservaslabs.repository.ReservaRepository#buscarSolapamientos}).
 */
public enum EstadoReserva {
    PENDIENTE, CONFIRMADA, CANCELADA
}
