package com.universidad.reservaslabs.repository;

import com.universidad.reservaslabs.model.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository del catálogo de laboratorios. No necesita consultas propias
 * más allá de la validación de nombre duplicado: el catálogo es un CRUD
 * simple sin reglas de negocio adicionales.
 */
@Repository
public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
    boolean existsByNombreIgnoreCase(String nombre);
}
