package com.universidad.reservaslabs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

/**
 * Representa un espacio físico reservable (laboratorio de cómputo,
 * electrónica, redes o multimedia). Es un catálogo simple: no contiene
 * ninguna regla de negocio propia, por eso {@link com.universidad.reservaslabs.controller.LaboratorioController}
 * lo maneja directamente sobre el Repository sin una capa Service dedicada
 * (ver "Decisiones de diseño" en el README, nota sobre LaboratorioController).
 */
@Entity
@Table(name = "laboratorios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laboratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "El nombre del laboratorio no puede estar vacío")
    private String nombre;

    @Column(nullable = false)
    @NotBlank(message = "La ubicación no puede estar vacía")
    private String ubicacion;

    @Min(value = 1, message = "La capacidad debe ser al menos 1")
    private Integer capacidad;

    @Column(nullable = false)
    @NotBlank(message = "El tipo de laboratorio no puede estar vacío")
    private String tipo; // COMPUTO, ELECTRONICA, REDES, MULTIMEDIA
}
