DROP DATABASE IF EXISTS personas;
CREATE DATABASE personas CHARACTER SET utf8mb4;
USE personas;


CREATE TABLE `Personas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(255) NOT NULL,
  `Apellidos` varchar(255) DEFAULT NULL,
  `Edad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


INSERT INTO personas (Nombre, Apellidos, Edad) VALUES ('Juan', 'Cuello', 40);
INSERT INTO personas (Nombre, Apellidos, Edad) VALUES ('Alicia', 'Martinez', 35);
INSERT INTO personas (Nombre, Apellidos, Edad) VALUES ('Celia', 'Perez', 18);




