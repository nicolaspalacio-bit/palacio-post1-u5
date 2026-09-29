-- data.sql
-- Catálogo inicial de laboratorios para poder probar de inmediato los
-- endpoints de reservas y la vista Thymeleaf sin tener que crear el
-- catálogo manualmente en cada arranque (H2 es una base en memoria).

INSERT INTO laboratorios (nombre, ubicacion, capacidad, tipo) VALUES
    ('Lab. Cómputo 1', 'Bloque A, piso 1', 25, 'COMPUTO'),
    ('Lab. Cómputo 3', 'Bloque B, piso 2', 30, 'COMPUTO'),
    ('Lab. Redes',     'Bloque B, piso 3', 20, 'REDES'),
    ('Lab. Electrónica', 'Bloque C, piso 1', 18, 'ELECTRONICA'),
    ('Lab. Multimedia', 'Bloque D, piso 2', 22, 'MULTIMEDIA');
