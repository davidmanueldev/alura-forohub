package com.forohub2024.forohub2024.model;

import com.forohub2024.forohub2024.dto.TopicoRegistrarDato;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity
@Table(name = "topico")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topico_id")
    private Long topicoId;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String mensaje;

    private boolean status;

    private String curso;

    @Column(name = "feDeCreacion", nullable = false)
    private LocalDateTime feDeCreacion;

    @ManyToOne(fetch = FetchType.LAZY) // FetchType.LAZY optimiza las consultas
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    // Constructors
    public Topico(String titulo, String mensaje, String curso, Usuario usuario) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.status = true;
        this.curso = curso;
        this.usuario = usuario;
        this.feDeCreacion = LocalDateTime.now();
    }

    public Topico() {}


    public Topico(@Valid TopicoRegistrarDato topicoRegistrarDato) {
    }
}