CREATE TABLE topico (
    topico_id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    mensaje TEXT NOT NULL,
    status BOOLEAN NOT NULL,
    curso VARCHAR(100) NOT NULL,
    usuario_id BIGINT NOT NULL,
    feDeCreacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (topico_id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(usuario_id)
);
