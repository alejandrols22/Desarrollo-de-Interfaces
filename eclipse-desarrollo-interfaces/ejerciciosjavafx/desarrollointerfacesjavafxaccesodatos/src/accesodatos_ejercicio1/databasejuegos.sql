CREATE DATABASE dbgametop;
USE dbgametop;

CREATE TABLE tvideojuegos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    anio INT NOT NULL,
    compania VARCHAR(255) NOT NULL,
    precio DOUBLE NOT NULL,
    sinopsis TEXT NOT NULL,
    plataforma VARCHAR(255) NOT NULL
);

INSERT INTO tvideojuegos (nombre, anio, compania, precio, sinopsis, plataforma) VALUES
('The Legend of Zelda: Breath of the Wild', 2017, 'Nintendo', 59.99, 'Un vasto mundo abierto que puedes explorar y descubrir.', 'Nintendo Switch'),
('God of War', 2018, 'Santa Monica Studio', 49.99, 'Una impresionante aventura de acción que redefine el género.', 'PlayStation 4'),
('The Witcher 3: Wild Hunt', 2015, 'CD Projekt Red', 39.99, 'Un juego de rol de mundo abierto con una historia profunda y envolvente.', 'PlayStation 4, Xbox One, PC');
