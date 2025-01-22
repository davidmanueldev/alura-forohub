CREATE TABLE usuario (
    usuario_id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(30) NOT NULL,
    email VARCHAR(60) NOT NULL UNIQUE,
    password VARCHAR(200) NOT NULL,
    PRIMARY KEY (usuario_id)
);