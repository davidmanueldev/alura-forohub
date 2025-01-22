package com.forohub2024.forohub2024.controller;

import com.forohub2024.forohub2024.dto.UsuarioRegistrarDato;
import com.forohub2024.forohub2024.model.Topico;
import com.forohub2024.forohub2024.model.Usuario;
import com.forohub2024.forohub2024.repository.TopicoRepository;
import com.forohub2024.forohub2024.repository.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody @Valid UsuarioRegistrarDato usuarioRegistrarDato) {

        usuarioRepository.save(new Usuario(usuarioRegistrarDato));

    }
}