package com.universidad.reservaslabs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.time.LocalDateTime;

/**
 * Representa la reserva concreta de un {@link Laboratorio} en un rango de
 * tiempo [inicio, fin) por parte de un estudiante o docente. Las reglas que
 * determinan si una reserva es válida (horario de atención, duración,
 * solapamiento con otras reservas activas) NO viven aquí: viven en
 * {@link com.universidad.reservaslabs.service.ReservaService}, que es la
 * única puerta de entrada para crear o cancelar una reserva.
 */
@Entity
@Table(name = "reservas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "laboratorio_id", nullable = false)
    private Laboratorio laboratorio;

    @Column(nullable = false)
    @NotBlank(message = "El nombre del solicitante no puede estar vacío")
    private String nombreSolicitante;

    @Column(nullable = false)
    @Email(message = "El correo del solicitante debe ser válido")
    private String correoSolicitante;

    @Column(nullable = false)
    @NotNull(message = "La fecha y hora de inicio es obligatoria")
    private LocalDateTime inicio;

    @Column(nullable = false)
    @NotNull(message = "La fecha y hora de fin es obligatoria")
    private LocalDateTime fin;

    private String motivo;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoReserva estado;
}
