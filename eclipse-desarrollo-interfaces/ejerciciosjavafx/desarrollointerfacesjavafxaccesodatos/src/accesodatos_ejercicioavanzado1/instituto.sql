
DROP DATABASE instituto;
CREATE DATABASE IF NOT EXISTS instituto;
USE instituto;

CREATE TABLE IF NOT EXISTS `alumno` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido1` varchar(100) NOT NULL,
  `apellido2` varchar(100) DEFAULT NULL,
  `fecha_nacimiento` date NOT NULL,
  `es_repetidor` enum('sí','no') NOT NULL,
  `telefono` varchar(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id`, `nombre`, `apellido1`, `apellido2`, `fecha_nacimiento`, `es_repetidor`, `telefono`) VALUES
(1, 'María', 'Sánchez', 'Pérez', '1990-12-01', 'no', NULL),
(2, 'Juan', 'Sáez', 'Vega', '1998-04-02', 'no', '618253876'),
(3, 'Pepe', 'Ramírez', 'Gea', '1988-01-03', 'no', NULL),
(4, 'Lucía', 'Sánchez', 'Ortega', '1993-06-13', 'sí', '678516294'),
(5, 'Paco', 'Martínez', 'López', '1995-11-24', 'no', '692735409'),
(6, 'Irene', 'Gutiérrez', 'Sánchez', '1991-03-28', 'sí', NULL),
(7, 'Cristina', 'Fernández', 'Ramírez', '1996-09-17', 'no', '628349590'),
(8, 'Antonio', 'Carretero', 'Ortega', '1994-05-20', 'sí', '612345633'),
(9, 'Manuel', 'Domínguez', 'Hernández', '1999-07-08', 'no', NULL),
(10, 'Daniel', 'Moreno', 'Ruiz', '1998-02-03', 'no', NULL),
(11, 'Bilbo', 'Rodriguez', 'Ortega' , '1998-02-03', 'sí', NULL);

