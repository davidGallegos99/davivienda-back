drop  database  if  exists  davivienda;
create   database  davivienda;
use  davivienda;

CREATE TABLE actividades_economicas (
    id_actividad_economica INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL
);

CREATE TABLE estado_civil (
    id_estado_civil INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL
);

CREATE TABLE forma_pago (
    id_forma_pago INT AUTO_INCREMENT PRIMARY KEY,
    descripcion VARCHAR(100) NOT NULL
);

CREATE TABLE persona (
    id_persona INT AUTO_INCREMENT PRIMARY KEY,
    dui VARCHAR(10) NOT NULL,
    nit VARCHAR(20) NOT NULL,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    id_actividad_economica INT,
    id_estado_civil INT,
    FOREIGN KEY (id_actividad_economica) REFERENCES actividades_economicas(id_actividad_economica),
    FOREIGN KEY (id_estado_civil) REFERENCES estado_civil(id_estado_civil)
);

CREATE TABLE solicitud (
    id_solicitud INT AUTO_INCREMENT PRIMARY KEY,
    id_persona INT,
    fecha_creacion DATETIME NOT NULL,
    monto DECIMAL(10,2) NOT NULL,
    plazo INT NOT NULL,
    id_forma_pago INT,
    FOREIGN KEY (id_persona) REFERENCES persona(id_persona) ON DELETE CASCADE,
    FOREIGN KEY (id_forma_pago) REFERENCES forma_pago(id_forma_pago)
);

-- Datos de prueba
INSERT INTO actividades_economicas (descripcion) VALUES
    ('Comerciante'),
    ('Empleado'),
    ('Independiente');

INSERT INTO estado_civil (descripcion) VALUES
    ('Soltero'),
    ('Casado'),
    ('Divorciado');

INSERT INTO forma_pago (descripcion) VALUES
    ('Efectivo'),
    ('Transferencia'),
    ('Cheque');

INSERT INTO persona (dui, nit, nombres, apellidos, sexo, id_actividad_economica, id_estado_civil) VALUES
    ('12345678-9', '0614-090290-101-3', 'Juan', 'Pérez', 'M', 1, 1),
    ('87654321-0', '0614-080190-102-4', 'Ana', 'Ramírez', 'F', 2, 2);

INSERT INTO solicitud (id_persona, fecha_creacion, monto, plazo, id_forma_pago) VALUES
    (1, '2024-07-01', 1500.00, 12, 2),
    (2, '2024-07-03', 2500.00, 24, 1);