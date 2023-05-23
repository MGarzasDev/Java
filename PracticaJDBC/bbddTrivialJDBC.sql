DROP DATABASE IF EXISTS TrivialJDBC;
CREATE DATABASE TrivialJDBC;

USE TrivialJDBC;

CREATE TABLE Autorias (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    fechaNacimiento DATE NOT NULL
);

CREATE TABLE libros (
    ISBN VARCHAR(20) PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    id_autoria INT NOT NULL,
    ejemplares INT NOT NULL,
    prestados INT NOT NULL,
    FOREIGN KEY (id_autoria) REFERENCES Autorias(id)
);

select * from libros;